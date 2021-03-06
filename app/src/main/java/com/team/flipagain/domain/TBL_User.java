package com.team.flipagain.domain;

/**
 * Created by delay on 28.03.2016.
 */
public class TBL_User {
    public static String getEmail() {
        return email;
    }

    public static String getPassword() {
        return password;
    }

    public static String getUserID() {
        return userID;
    }

    public static String getTableName() {
        return TABLE_NAME;
    }

    /**
     * Name der Datenbanktabelle
     */
    public static final String TABLE_NAME = "user";
    /**
     * PrimaryKey
     */
    private static final String userID = "userID";

    /**
     * Attribute
     */
    private static final String name = "name";

    public static String getName() {
        return name;
    }

    private static final String email = "email";
    private static final String password = "password";
    /**
     * SQL Anweisung zur Schemadefintion
     */
    public static final String SQL_CREATE = "CREATE TABLE " + TABLE_NAME + "(" +
            userID + " INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE," +
            name + " TEXT ," +
            email + " TEXT ," +
            password + " TEXT " +
            ")";

    /**
     * Standart-Sortierreihenfolge für die Tabelle
     */
    public static final String DEFAULT_SORT_ORDER =
            name;

    /**
     * SQL Anweisung zum loeschen der Tabelle
     */

    public static final String SQL_DROP =
            "DROP TABLE IF EXISTS " +
                    TABLE_NAME;

    /**
     * SQL STATEMENT INSERT
     */
    public static final String STMT_MODULE_INSERT =
            "INSERT INTO " + TABLE_NAME +
                    "(name, email, password) " +
                    "VALUES (?,?,?)";

    /**
     * SQL STATEMENT DELETE
     */
    public static final String STMT_STUDY_DELETE =
            "DELETE FROM " + TABLE_NAME;






}


