package com.lineage.server.infrastructure.persistence.mybatis.handler.impl;

import com.hw.lineage.common.enums.ParseStatus;
import com.lineage.server.infrastructure.persistence.mybatis.handler.IntEnumTypeHandler;

/**
 * @description: ParseStatusTypeHandler
 * @author: HamaWhite
 * @version: 1.0.0
 * @date: 2023/2/4 9:15 PM
 */
public class ParseStatusTypeHandler extends IntEnumTypeHandler<ParseStatus> {
    public ParseStatusTypeHandler() {
        super(ParseStatus.class);
    }
}
