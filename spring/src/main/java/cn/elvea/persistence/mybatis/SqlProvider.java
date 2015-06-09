package cn.elvea.persistence.mybatis;

import cn.elvea.persistence.dialect.Dialect;

public class SqlProvider {
    protected Dialect dialect;

    public SqlProvider() {
        this.dialect = Dialect.getInstance();
    }

    public String getTimeSql() {
        return this.dialect.getTimeSql();
    }

    public String getDateSql() {
        return this.dialect.getDateSql();
    }
}
