package com.glue_si.aiolos.common.dbflute;

import javax.sql.DataSource;

import com.glue_si.aiolos.dbflute.allcommon.DBFluteConfig;
import com.glue_si.aiolos.dbflute.allcommon.DBFluteInitializer;

public class ExtendedDBFluteInitializer extends DBFluteInitializer {
    public ExtendedDBFluteInitializer(DataSource dataSource) {
        super(dataSource);
    }
    @Override
    protected void setupDataSourceHandler(String dataSourceFqcn) {
        final DBFluteConfig config = DBFluteConfig.getInstance();
        config.unlock();
        config.setDataSourceHandler(new DBFluteConfig.SpringTransactionalDataSourceHandler());
    }
}
