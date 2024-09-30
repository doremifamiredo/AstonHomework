import data.APIHelper;
import data.DataHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RequesMethodsTest {
    APIHelper apiHelper = new APIHelper();
    String body = "This is expected to be sent back as part of response body.";

    @Test
    void reuestWoops() {
        DataHelper.Woops woops = apiHelper.requestWoops();
        DataHelper.Headers headers = woops.getHeaders();
        DataHelper.Args foo = woops.getArgs();
        assertAll(() -> assertEquals("bar1", foo.getFoo1()),
                () -> assertEquals("bar2", foo.getFoo2()),
                () -> assertEquals("postman-echo.com", headers.getHost()),
                () -> assertEquals("close", headers.getConnection()),
                () -> assertEquals(29, headers.getContentLength()),
                () -> assertEquals("https", headers.getProto()),
                () -> assertEquals(443, headers.getPort()),
                () -> assertEquals("application/json, application/javascript, text/javascript, text/json", headers.getAccept()),
                () -> assertEquals("application/json", headers.getContentType()),
                () -> assertEquals("Apache-HttpClient/4.5.13 (Java/11.0.23)", headers.getUserAgent()),
                () -> assertEquals("gzip,deflate", headers.getAcceptEncoding()),
                () -> assertEquals("https://postman-echo.com/get", woops.getUrl()));
    }

    @Test
    void rawText() {
        DataHelper.RawText rawText = apiHelper.requestRawText(body);
        DataHelper.Headers headers = rawText.getHeaders();
        assertAll(() -> assertEquals(body, rawText.getData()),
                () -> assertEquals("postman-echo.com", headers.getHost()),
                () -> assertEquals("close", headers.getConnection()),
                () -> assertEquals(body.length(), headers.getContentLength()),
                () -> assertEquals("https", headers.getProto()),
                () -> assertEquals(443, headers.getPort()),
                () -> assertEquals("application/json, application/javascript, text/javascript, text/json", headers.getAccept()),
                () -> assertEquals("application/json", headers.getContentType()),
                () -> assertEquals("Apache-HttpClient/4.5.13 (Java/11.0.23)", headers.getUserAgent()),
                () -> assertEquals("gzip,deflate", headers.getAcceptEncoding()),
                () -> assertEquals("https://postman-echo.com/post", rawText.getUrl()));
    }

    @Test
    void formData() {
        apiHelper.requestFormData();
    }

    @Test
    void putRequest() {
        apiHelper.requestPut(body);
    }

    @Test
    void requestPatch() {
        apiHelper.requestPatch(body);
    }

    @Test
    void requestDelete() {
        apiHelper.requestDelete(body);
    }
}
