package data;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class DataHelper {

    @Data
    public static class Woops {
        public Args args;
        public Headers headers;
        public String url;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Args {
        String foo1;
        String foo2;
    }

    public static Args getArgs() {
        return new Args("bar1", "bar2");
    }

    @Data
    public static class Headers{
        String host;
        @JsonSetter("x-request-start")
                String start;
        String connection;
        @JsonSetter("content-length")
                int contentLength;
        @JsonSetter("x-forwarded-proto")
                String proto;
        @JsonSetter("x-forwarded-port")
                int port;
        @JsonSetter("x-amzn-trace-id")
                String id;
        @JsonSetter("content-type")
                String contentType;
        @JsonSetter("user-agent")
                String userAgent;
        String accept;
        @JsonSetter("postman-token")
                String postmanToken;
        @JsonSetter("accept-encoding")
                String acceptEncoding;
        String cookie;
    }

    @Data
    public static class RawText {
        NoArgs args;
        String data;
        Files files;
        Form form;
        Headers headers;
        String json;
        String url;
    }

    @Data
    public static class Files {
    }

    @Data
    public static class Form {
    }

    @Data
    public static class NoArgs {
    }
}
