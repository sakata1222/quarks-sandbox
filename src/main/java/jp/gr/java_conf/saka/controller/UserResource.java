package jp.gr.java_conf.saka.controller;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import jp.gr.java_conf.saka.application.IUserRegisterService;
import jp.gr.java_conf.saka.controller.dto.UserPresentationDto;
import jp.gr.java_conf.saka.controller.dto.UserPresentationDtoTranslator;

@Path("/user")
public class UserResource {

  private final UserPresentationDtoTranslator translator;

  private final IUserRegisterService registerService;

  @Inject
  public UserResource(UserPresentationDtoTranslator translator,
    IUserRegisterService registerService) {
    this.translator = translator;
    this.registerService = registerService;
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public Response post(UserPresentationDto dto, @Context UriInfo uri) {
    var registered = registerService.register(translator.toRegisterCommand(dto));
    return Response
      .created(uri.getAbsolutePathBuilder().path(registered.getId()).build())
      .entity(translator.toPresentationDto(registered))
      .build();
  }
}
