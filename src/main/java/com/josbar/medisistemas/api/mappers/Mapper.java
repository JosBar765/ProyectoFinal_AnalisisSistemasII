package com.josbar.medisistemas.api.mappers;

public interface Mapper<Entity, Request, Response> {

    Entity toEntity(Request request);

    Response toResponse(Entity entity);
}
