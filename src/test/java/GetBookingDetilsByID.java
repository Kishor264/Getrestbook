import org.testng.Assert;
import org.testng.annotations.Test;
import restfulbooker.getbookingdetailsbyid.BookingdetailsResponse;
import restfulbooker.getbookingdetailsbyid.Getbookingdetailsbyclient;

public class GetBookingDetilsByID extends BaseTest
{
    @Test
public void getbookingdetailsbyid()
    {
        BookingdetailsResponse bookingdetailsResponse =new Getbookingdetailsbyclient().getDetailsById(1724);
       /* Assert.assertEquals(bookingdetailsResponse.getFirstname(),"john");
        Assert.assertEquals(bookingdetailsResponse.getLastname(),"smith");
        Assert.assertEquals(bookingdetailsResponse.getTotalprice(),3000);
        Assert.assertEquals(bookingdetailsResponse.getBookingdates().getCheckin(), "2018-01-01");
        Assert.assertEquals(bookingdetailsResponse.getBookingdates().getCheckout(),"2027-01-01");
        Assert.assertTrue(bookingdetailsResponse.isDepositpaid());
        Assert.assertEquals(bookingdetailsResponse.getAdditionalneeds(),"new");
*/
    }
}
