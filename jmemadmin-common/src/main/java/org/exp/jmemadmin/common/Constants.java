package org.exp.jmemadmin.common;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Constants.
 *
 * @author ZhangQingliang
 *
 */
public class Constants {
    public static final String HTTP_SHCEME = "http";
    /**
     * Encoding.
     */
    public static final String DEFAULT_ENCODING = "UTF-8";
    public static final Charset DEFAULT_ENCODING_CHARSET = StandardCharsets.UTF_8;

    /**
     * Delimiters.
     */
    public static final String SLASH_DELIMITER = "/";
    public static final String COLON_DELIMITER = ":";
    public static final String BAR_DELIMITER = "-";
    public static final String COMMAND_DELIMITER = " ";

    /**
     * Rest
     */
    public static final String REST_AGENT_ROOT_PATH = "/memcached/agent";
    public static final String REST_AGENT_START_SUBPATH = "/start";
    public static final String REST_AGENT_STOP_SUBPATH = "/stop";
    public static final String REST_SERVER_PATH = "/memcached";
    public static final String REST_SERVER_START_SUBPATH = "/start";
    public static final String REST_SERVER_STOP_SUBPATH = "/stop";
    public static final String REST_SERVER_GET_SUBPATH = "/get";
    public static final String REST_SERVER_SET_SUBPATH = "/set";
    public static final String REST_SERVER_DELETE_SUBPATH = "/delete";
    public static final String REST_SERVER_STAT_SUBPATH = "/stat";
    public static final String REST_SERVER_LIST_SUBPATH = "/list";
    public static final String PORT = "port";
    public static final String HOST_QUERY_KEY = "host";
    public static final String MEMORY_SIZE = "memorySize";
    public static final String IS_MASTER = "isMaster";

    public static final String REQUEST_BODY_HOST_NAME = "host";
    public static final String REQUEST_BODY_PORT_NAME = "port";
    public static final String REQUEST_BODY_MEMSIZE_NAME = "mem";
    public static final String REQUEST_BODY_ISMASTER_NAME = "master";

    /*
     * TODO Delete codes below.
     */
    public static final String IP = "10.142.90.152";
    public static final String SLAVE_USERNAME = "dfs";
    public static final String SLAVE_PASSWORD = "dfs123";

    private Constants() {
        // Do nothing
    }

}
