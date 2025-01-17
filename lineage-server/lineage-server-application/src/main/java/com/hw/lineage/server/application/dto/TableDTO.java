package com.hw.lineage.server.application.dto;

import com.hw.lineage.common.enums.TableKind;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description: TableDTO
 * @author: HamaWhite
 */
@Data
@AllArgsConstructor
public class TableDTO {
    private String tableName;

    private TableKind tableKind;
}
