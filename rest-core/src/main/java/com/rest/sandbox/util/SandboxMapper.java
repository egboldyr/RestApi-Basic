package com.rest.sandbox.util;

import com.rest.api.dto.SandboxDTO;
import com.rest.sandbox.domain.SandboxEntity;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.List;

/**
 * Created by EGBoldyr on 22.05.18.
 */

@Mapper(componentModel = "spring")
public interface SandboxMapper {

    SandboxDTO sandboxDomainToSandboxDto(SandboxEntity entity);

    List<SandboxDTO> sandboxDomainListToSandboxDtoList(Collection<SandboxEntity> entities);

}
