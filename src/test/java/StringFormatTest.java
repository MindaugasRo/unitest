import org.example.StringFormat;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringFormatTest {
    @Test
    public void phoneCaseFieldIsEmptyTest(){
        String phone = "";
        Assert.assertEquals(StringFormat.formatPhoNo(phone),"");
    }
    @Test
    public void phoneCaseFieldWithSimbolsTest(){
        String phone = "*674Ū77!780";
        Assert.assertEquals(StringFormat.formatPhoNo(phone),"67477780");
    }
    @Test
    public void phoneCaseFieldWithZerosTest(){
        String phone = "0067477780";
        Assert.assertEquals(StringFormat.formatPhoNo(phone),"67477780");
    }
    @Test
    public void phoneCaseFieldWithCountryCodeTest(){
        String phone = "+37067477780";
        Assert.assertEquals(StringFormat.formatPhoNo(phone),"67477780");
    }
    @Test
    public void phoneCaseFieldWithoutCountryCodeTest(){
        String phone = "67477780";
        Assert.assertEquals(StringFormat.formatPhoNo(phone),"67477780");
    }
}
