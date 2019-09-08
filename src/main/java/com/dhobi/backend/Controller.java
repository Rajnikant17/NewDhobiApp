package com.dhobi.backend;

import com.dhobi.backend.Repository.HomePageRepository;
import com.dhobi.backend.Repository.OtpRepository;
import com.dhobi.backend.Repository.PaymentSummaryRepository;
import com.dhobi.backend.Repository.Registrationrepository;
import com.dhobi.backend.model.*;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private ServicesForRegistration servicesForRegistration;
    @Autowired
    ServiceForOtp serviceForOtp;
    @Autowired
    ServiceForOtpExample serviceForOtpExample;
    @Autowired
    OtpRepository otpRepository;
    @Autowired
    ServiceForLogin serviceForLogin;
    @Autowired
    ServiceForDashBoard serviceForDashBoard;
    @Autowired
    ServicesHomepage servicesHomepage;
    @Autowired
    Registrationrepository registrationrepository;
    @Autowired
    ServicePaymentSummary servicePaymentSummary;
    @Autowired
    ServiceAddressList serviceAddressList;
    @Autowired
    ServicesOrderHistory servicesOrderHistory;
    @Autowired
    ServiceUpdateProfile serviceUpdateProfile;

    /*spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=test*/

  /*  @GetMapping("/mongodb/{name}")
    public MRegistration retrievemonodbdata(@PathVariable String name) {
        //return studentService.retrieveStudent(studentId);
       // return repository.findByFirstName(name);
        //  return repository.findAll();
        return null;
    }

    @GetMapping("/getUserByAddress/{city}")
    public MRegistration getUserbyAddress(@PathVariable String city) {
       // return repository.findByCity(city);
        return null;
    } */

   @PostMapping("/mongodb/Registration")
    public MRegistrationResponse saveemonodbdata(@RequestBody MRegistration mRegistration) throws UnirestException {
        return servicesForRegistration.RegistrationMethod(mRegistration);
    }

    @PostMapping("/mongodb/OtpVerification")
     public MOtpResponse otpVerification(@RequestBody MOtp mOtp)
    {
     return serviceForOtp.otpResponse(mOtp);
    }

    @PostMapping("/mongodb/Login")
    public MLoginResponse login(@RequestBody MLogin mLogin)
    {
        return serviceForLogin.serviceforlogin(mLogin);
    }

  /*  @GetMapping("/mongodb/dashboard/index")
    public MGettingDashBoardData mGettingDashBoardData() {
        serviceForDashBoard.serviceForDashBoard();
        return serviceForDashBoard.serviceForDashBoard(); */
  @GetMapping("/mongodb/dashboard/index")
  public String mGettingDashBoardData() {
      //serviceForDashBoard.serviceForDashBoard();
      return "Everything is  well";
        // return repository.findByCity(city);
       /* MDashBoard  mDashBoard=new MDashBoard();
        List<MForDashBoardViewpager> mForDashBoardViewpagerlist = new ArrayList<>();
        List<String> imageurlList = new ArrayList<>();
        imageurlList.add("https://media-public.canva.com/MADaFMAyVts/1/screen_2x.jpg");
        imageurlList.add("https://media-public.canva.com/MADarJlyML8/1/screen_2x.jpg");
        imageurlList.add("https://media-public.canva.com/MADBje6ObhM/1/screen_2x.jpg");
        for(int i=0;i<3;i++)
        {
            MForDashBoardViewpager mForDashBoardViewpager=new MForDashBoardViewpager();
            mForDashBoardViewpager.setImageurl(imageurlList.get(i));
            mForDashBoardViewpagerlist.add(mForDashBoardViewpager) ;
        }
        mDashBoard.setMenstitle("Men's Wears");
        mDashBoard.setWomenstitle("Women's Wears");
        mDashBoard.setOtherstitle("Others's Wears");
        mDashBoard.setMens_imageur("https://media-public.canva.com/MACNSuop1sg/1/screen_2x.jpg");
        mDashBoard.setWomens_imageur("https://media-public.canva.com/MADOYKqm69o/1/screen_2x.jpg");
        mDashBoard.setMens_imageur("https://media-public.canva.com/MACbEPEgI90/1/screen_2x.jpg");
        mDashBoard.setmForDashBoardViewpagerlist(mForDashBoardViewpagerlist);
        dashBoardRepositries.save(mDashBoard); */

    }


  /*  @PostMapping("/mongodb/getUser")
    public ModelForSavingOtp getUserbyA(@RequestBody ModelForSavingOtp modelForSavingOtp) {
        {
            return serviceForOtpExample.saveotp(modelForSavingOtp);
        }
    }
    @GetMapping("/mongodb/{mobile}")
    public ModelForSavingOtp update(@PathVariable String mobile) {
         return serviceForOtpExample.update(mobile);
       // return null;
    }
    @GetMapping("/mongodb/{mob}")
    public ModelForSavingOtp getOTP(@PathVariable String mob)
    {
        return otpRepository.findLastSendOtpDocument(mob,1);
    } */

        @GetMapping("/mongodb/homepage/index")
        public MHomepage mGettinghomepagedData() {
        return servicesHomepage.servicesHomepage();
       /* MDataHomePage mDataHomePage=new MDataHomePage();
        List<MForMensWear> mensWearList=new ArrayList<>();
        List<MForWomensWear> womensWearList=new ArrayList<>();
        List<MForOtherWear> otherWearList=new ArrayList<>();
        List<MMensWearQuestion> mensWearQuestionList=new ArrayList<>();
        List<MForWomensWearQuestion> womensWearQuestionList=new ArrayList<>();
        List<MForOtherWearQuestion> mForOtherWearQuestionList = new ArrayList<>();
        MForMensWear mForMensWear=new MForMensWear();
        MForWomensWear mForWomensWear=new MForWomensWear();
        MForOtherWear mForOtherWear=new MForOtherWear();
        MMensWearQuestion mMensWearQuestion = new MMensWearQuestion();
        MForWomensWearQuestion mForWomensWearQuestion=new MForWomensWearQuestion();
        MForOtherWearQuestion mForOtherWearQuestion=new MForOtherWearQuestion();

        //For MensWear
        mMensWearQuestion.setMensWearQuestions("Why you looking so dull today ?");
        mMensWearQuestion.setMensWearAnswer("Why you looking so dull today public static class ParentMyHandler extends ParentViewHolder public static class ChildMyHandler.");
        mensWearQuestionList.add(mMensWearQuestion);
        mForMensWear.setItemId("MPant1");
        mForMensWear.setMensWeartitle("Pants");
        mForMensWear.setPrice("10");
        mForMensWear.setMensWearimageurl("imageurl");
        mForMensWear.setBasicdetails("Mallya hospital is located in the heart of the Bengaluru city and has grown over the year with substantial increase.");
        mForMensWear.setMensWearQuestionList(mensWearQuestionList);
        mensWearList.add(mForMensWear);

        //For WomensWear
        mForWomensWearQuestion.setWomensWearQuestions("Why you looking so dull today ?");
        mForWomensWearQuestion.setWomensWearAnswer("Why you looking so dull today public static class ParentMyHandler extends ParentViewHolder public static class ChildMyHandler.");
        womensWearQuestionList.add(mForWomensWearQuestion);
        mForWomensWear.setItemId("WLeggins1");
        mForWomensWear.setWomensWeartitle("Leggins");
        mForWomensWear.setPrice("20");
        mForWomensWear.setWomensWearimageurl("imageurl");
        mForWomensWear.setBasicdetails("Mallya hospital is located in the heart of the Bengaluru city and has grown over the year with substantial increase.");
        mForWomensWear.setWomensWearQuestionList(womensWearQuestionList);
        womensWearList.add(mForWomensWear);

        //For OthersWear
        mForOtherWearQuestion.setOtherWearQuestions("Why you looking so dull today ?");
        mForOtherWearQuestion.setOtherWearAnswer("Why you looking so dull today public static class ParentMyHandler extends ParentViewHolder public static class ChildMyHandler.");
        mForOtherWearQuestionList.add(mForOtherWearQuestion);
        mForOtherWear.setItemId("OBlanket1");
        mForOtherWear.setOthersWeartitle("Blanket");
        mForOtherWear.setPrice("25");
        mForOtherWear.setOthersimageurl("imageurl");
        mForOtherWear.setBasicdetails("Mallya hospital is located in the heart of the Bengaluru city and has grown over the year with substantial increase.");
        mForOtherWear.setmForOtherWearQuestionList(mForOtherWearQuestionList);
        otherWearList.add(mForOtherWear);

        mDataHomePage.setMensWearList(mensWearList);
        mDataHomePage.setWomensWearList(womensWearList);
        mDataHomePage.setOtherWearList(otherWearList);
          return   homePageRepository.save(mDataHomePage); */

    }
   @PostMapping("/mongodb/payment")
    public MResponsePayment servicesforPaymentSummary(@RequestBody MPayment mPayment)
    {

      return servicePaymentSummary.serviceForpaymentSummary(mPayment);
       /* MPayment mPayment = new MPayment();
        List<MUserBookedItem> mUserBookedItemlist=new ArrayList<>();
       // MUserAddress mUserAddress =new MUserAddress();
        MUserBookedItem mUserBookedItem  = new MUserBookedItem();

        //Address
       // mUserAddress.setFlatnoOrStreetNo("House-no12");
       // mUserAddress.setLocality("J.P.Nagar");
       // mUserAddress.setCity("Bangalore");
       // mUserAddress.setPincode("56003");

        //UserDetails
        mUserBookedItem.setItemId("fgrtr");
        mUserBookedItem.setItemsName("Pant");
        mUserBookedItem.setNoOfItems("10");
        mUserBookedItem.setTotalPrice("100rs");
        mUserBookedItem.setImage("njxjaxxuxuxuaxuka");
        mUserBookedItemlist.add(mUserBookedItem);

        mPayment.setOrderid("#Dcart1");
        mPayment.setMobileno("56655766");
        mPayment.setPaymentId("ajxjhahj");
        mPayment.setOnlinePaymentMode(true);
        mPayment.setTotalItem("10");
        mPayment.setTotalPrice("400");
        mPayment.setDeliverytime("12july'2019");
        mPayment.setBookingtime("12-10 AM");
        mPayment.setmUserBookedItemlist(mUserBookedItemlist);
        mPayment.setUserAddress("mUserAddress");
        return paymentSummaryRepository.save(mPayment); */



    }

   /* @PostMapping("/mongodb/address")
    public MAddress serviceforAddress(@RequestBody MLogin mLogin)
    {
        return serviceAddressList.setAddressListRepository(mLogin);
    } */

    @PostMapping("/mongodb/address")
    public MResponseAddress serviceforAddress(@RequestBody MAddress mAddress)
    {
        return serviceAddressList.setAddressListRepository(mAddress);
    }

    @PostMapping("/mongodb/orderhistory")
    public MResponseOrderHistory serviceforOrderHistory(@RequestBody MMobileNo mMobileNo)
    {

        return servicesOrderHistory.serviceforOrderHistory(mMobileNo);
    }

    @PostMapping("/mongodb/profileupdate")
    public MResponseProfile serviceforProfileUpdate(@RequestBody MProfileData mProfileData)
    {

        return serviceUpdateProfile.update(mProfileData);
    }

    @PostMapping("/mongodb/profile")
    public MResponseProfile serviceforProfile(@RequestBody MMobileNo mMobileNo)
    {    MRegistration mRegistration=registrationrepository.findBymobilenoAndStatus(mMobileNo.getMobileno(),1);
         MResponseProfile mResponseProfile=new MResponseProfile();
        mResponseProfile.setCode(200);
        mResponseProfile.setUsername(mRegistration.username);
        mResponseProfile.setMobileno(mRegistration.mobileno);
        return mResponseProfile;
    }
}
