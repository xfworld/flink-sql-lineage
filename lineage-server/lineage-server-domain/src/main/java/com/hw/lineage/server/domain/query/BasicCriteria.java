package com.hw.lineage.server.domain.query;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @description: BasicCriteria
 * @author: HamaWhite
 */
@Data
public class BasicCriteria implements Serializable {
    @NotNull
    @ApiModelProperty(hidden = true)
    private Long userId;
}
