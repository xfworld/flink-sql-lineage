package com.hw.lineage.server.application.dto.graph.vertex;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description: Column
 * @author: HamaWhite
 */
@Data
@AllArgsConstructor
public class Column {

    private String id;

    private String name;

    private Integer childrenCnt;
}
