package com.mohsinkd786.designpattern.structural;

public class DbFacade {

    public static void exportDB(String dbType){
        switch (dbType){
            case "SQL":
                Sql sql = new Sql();
                String url = Sql.getConUrl();
                sql.exportDB(url);
            case "NOSQL":
                NoSql noSql = new NoSql();
                url = NoSql.getNoSqlUrl();
                noSql.exportNoSqlDb(url);
        }
    }
}
