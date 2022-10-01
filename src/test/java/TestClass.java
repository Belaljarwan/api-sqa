import com.sqa.api.request.HttpMethods;
import com.sqa.api.utils.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.sqa.api.request.HttpMethods.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class TestClass extends BaseClass {


    @Test
    public void createUser(){
        requestBuilder.setRequestMethod(POST);
        requestBody.put("name", "bilal");
        requestBody.put("job", "QA");
        requestBuilder.setRequestBody(requestBody);
        requestBuilder.setPath("/users");
        requestExecutor.request(requestBuilder);
        assertEquals(responseHandler.getStatusCode(),201);
        assertEquals(responseHandler.getResponseValue("name").toString(),"bilal");
        assertTrue(responseHandler.getResponseTime()<20);

    }

}
