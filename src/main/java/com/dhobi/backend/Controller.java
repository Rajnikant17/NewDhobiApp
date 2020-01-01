package com.dhobi.backend;

import com.dhobi.backend.Repository.*;
import com.dhobi.backend.model.*;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    @Autowired
    HomePageRepository homePageRepository;
    @Autowired
    DashBoardRepositries dashBoardRepositries;
    @Autowired
    CityListRepository cityListRepository;
    @Autowired
    MerchantListRepository merchantListRepository;
    @Autowired
    NewHomePageRepository newHomePageRepository;
    @Autowired
    ServicesCityList servicesCityList;
    @Autowired
    ServicesMerchantList servicesMerchantList;
    @Autowired
    ServicesNewHomePage servicesNewHomePage;

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

    @GetMapping("/mongodb/dashboard/index")
    public MGettingDashBoardData mGettingDashBoardData() {
        serviceForDashBoard.serviceForDashBoard();
        return serviceForDashBoard.serviceForDashBoard();
 /* @GetMapping("/mongodb/dashboard/index")
  public MDashBoard mGettingDashBoardData() {
      //serviceForDashBoard.serviceForDashBoard();
        // return repository.findByCity(city);
        MDashBoard  mDashBoard=new MDashBoard();
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
        return dashBoardRepositries.save(mDashBoard); */

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
      /*  MDataHomePage mDataHomePage=new MDataHomePage();
        List<MForMensWear> mensWearList=new ArrayList<>();
        List<MForWomensWear> womensWearList=new ArrayList<>();
        List<MForOtherWear> otherWearList=new ArrayList<>();
        List<MMensWearQuestion> mensWearQuestionList=new ArrayList<>();
        List<MForWomensWearQuestion> womensWearQuestionList=new ArrayList<>();
        List<MForOtherWearQuestion> mForOtherWearQuestionList = new ArrayList<>();

           MForMensWear mForMensWear1=new MForMensWear();
           MForMensWear mForMensWear2=new MForMensWear();
           MForMensWear mForMensWear3=new MForMensWear();

           MForWomensWear mForWomensWear1=new MForWomensWear();
           MForWomensWear mForWomensWear2=new MForWomensWear();
           MForWomensWear mForWomensWear3=new MForWomensWear();

           MForOtherWear mForOtherWear1=new MForOtherWear();
           MForOtherWear mForOtherWear2=new MForOtherWear();
           MForOtherWear mForOtherWear3=new MForOtherWear();

           MMensWearQuestion mMensWearQuestion = new MMensWearQuestion();
           MMensWearQuestion mMensWearQuestion2 = new MMensWearQuestion();
           MMensWearQuestion mMensWearQuestion3 = new MMensWearQuestion();

           MForWomensWearQuestion mForWomensWearQuestion=new MForWomensWearQuestion();
           MForWomensWearQuestion mForWomensWearQuestion2=new MForWomensWearQuestion();
           MForWomensWearQuestion mForWomensWearQuestion3=new MForWomensWearQuestion();

           MForOtherWearQuestion mForOtherWearQuestion=new MForOtherWearQuestion();
           MForOtherWearQuestion mForOtherWearQuestion2=new MForOtherWearQuestion();
           MForOtherWearQuestion mForOtherWearQuestion3=new MForOtherWearQuestion();
        //For MensWear
        mMensWearQuestion.setMensWearQuestions("Why you looking so dull today ?");
        mMensWearQuestion.setMensWearAnswer("Why you looking so dull today public static class ParentMyHandler extends ParentViewHolder public static class ChildMyHandler.");

        mensWearQuestionList.add(mMensWearQuestion);
        mForMensWear1.setItemId("MPant");
           mForMensWear1.setMensWeartitle("Pants");
           mForMensWear1.setPrice("10");
           mForMensWear1.setMensWearimageurl("https://media-public.canva.com/MACNSuop1sg/1/screen_2x.jpg");
           mForMensWear1.setBasicdetails("Mallya hospital is located in the heart of the Bengaluru city and has grown over the year with substantial increase.");
           mForMensWear1.setMensWearQuestionList(mensWearQuestionList);

           mForMensWear2.setItemId("MJeans");
           mForMensWear2.setMensWeartitle("Jeans");
           mForMensWear2.setPrice("15");
           mForMensWear2.setMensWearimageurl("https://media-public.canva.com/MACNSuop1sg/1/screen_2x.jpg");
           mForMensWear2.setBasicdetails("Mallya hospital is located in the heart of the Bengaluru city and has grown over the year with substantial increase.");
           mForMensWear2.setMensWearQuestionList(mensWearQuestionList);

           mForMensWear3.setItemId("MShirt");
           mForMensWear3.setMensWeartitle("Shirt");
           mForMensWear3.setPrice("20");
           mForMensWear3.setMensWearimageurl("https://media-public.canva.com/MACNSuop1sg/1/screen_2x.jpg");
           mForMensWear3.setBasicdetails("Mallya hospital is located in the heart of the Bengaluru city and has grown over the year with substantial increase.");
           mForMensWear3.setMensWearQuestionList(mensWearQuestionList);
           mensWearList.add(mForMensWear1);
           mensWearList.add(mForMensWear2);
           mensWearList.add(mForMensWear3);

           //For WomensWear
        mForWomensWearQuestion.setWomensWearQuestions("Why you looking so dull today ?");
        mForWomensWearQuestion.setWomensWearAnswer("Why you looking so dull today public static class ParentMyHandler extends ParentViewHolder public static class ChildMyHandler.");
        womensWearQuestionList.add(mForWomensWearQuestion);
          mForWomensWear1.setItemId("WJeans");
           mForWomensWear1.setWomensWeartitle("Jeans");
           mForWomensWear1.setPrice("10");
           mForWomensWear1.setWomensWearimageurl("https://media-public.canva.com/MADOYKqm69o/1/screen_2x.jpg");
           mForWomensWear1.setBasicdetails("Mallya hospital is located in the heart of the Bengaluru city and has grown over the year with substantial increase.");
           mForWomensWear1.setWomensWearQuestionList(womensWearQuestionList);

           mForWomensWear2.setItemId("WLeggins");
           mForWomensWear2.setWomensWeartitle("Leggins");
           mForWomensWear2.setPrice("20");
           mForWomensWear2.setWomensWearimageurl("https://media-public.canva.com/MADOYKqm69o/1/screen_2x.jpg");
           mForWomensWear2.setBasicdetails("Mallya hospital is located in the heart of the Bengaluru city and has grown over the year with substantial increase.");
           mForWomensWear2.setWomensWearQuestionList(womensWearQuestionList);

           mForWomensWear3.setItemId("WJacket");
           mForWomensWear3.setWomensWeartitle("Leggins");
           mForWomensWear3.setPrice("15");
           mForWomensWear3.setWomensWearimageurl("https://media-public.canva.com/MADOYKqm69o/1/screen_2x.jpg");
           mForWomensWear3.setBasicdetails("Mallya hospital is located in the heart of the Bengaluru city and has grown over the year with substantial increase.");
           mForWomensWear3.setWomensWearQuestionList(womensWearQuestionList);
        womensWearList.add(mForWomensWear1);
           womensWearList.add(mForWomensWear2);
           womensWearList.add(mForWomensWear3);

        //For OthersWear
        mForOtherWearQuestion.setOtherWearQuestions("Why you looking so dull today ?");
        mForOtherWearQuestion.setOtherWearAnswer("Why you looking so dull today public static class ParentMyHandler extends ParentViewHolder public static class ChildMyHandler.");
        mForOtherWearQuestionList.add(mForOtherWearQuestion);
        mForOtherWear1.setItemId("OBlanket");
        mForOtherWear1.setOthersWeartitle("Blanket");
        mForOtherWear1.setPrice("10");
        mForOtherWear1.setOthersimageurl("https://media-public.canva.com/MACbEPEgI90/1/screen_2x.jpg");
        mForOtherWear1.setBasicdetails("Mallya hospital is located in the heart of the Bengaluru city and has grown over the year with substantial increase.");
        mForOtherWear1.setmForOtherWearQuestionList(mForOtherWearQuestionList);

           mForOtherWearQuestionList.add(mForOtherWearQuestion);
           mForOtherWear2.setItemId("OBedsheet");
           mForOtherWear2.setOthersWeartitle("Bed-Sheet");
           mForOtherWear2.setPrice("15");
           mForOtherWear2.setOthersimageurl("https://media-public.canva.com/MACbEPEgI90/1/screen_2x.jpg");
           mForOtherWear2.setBasicdetails("Mallya hospital is located in the heart of the Bengaluru city and has grown over the year with substantial increase.");
           mForOtherWear2.setmForOtherWearQuestionList(mForOtherWearQuestionList);

           mForOtherWearQuestionList.add(mForOtherWearQuestion);
           mForOtherWear3.setItemId("OPillow");
           mForOtherWear3.setOthersWeartitle("Pillow");
           mForOtherWear3.setPrice("20");
           mForOtherWear3.setOthersimageurl("https://media-public.canva.com/MACbEPEgI90/1/screen_2x.jpg");
           mForOtherWear3.setBasicdetails("Mallya hospital is located in the heart of the Bengaluru city and has grown over the year with substantial increase.");
           mForOtherWear3.setmForOtherWearQuestionList(mForOtherWearQuestionList);

          otherWearList.add(mForOtherWear1);
           otherWearList.add(mForOtherWear2);
           otherWearList.add(mForOtherWear3);

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

    @GetMapping("/mongodb/cityList")
    public MCityList serviceForCityList()
    {
       return  servicesCityList.servicesCityList();
//        List<MDataCityList> mDataCityListList =new ArrayList<>();
//        MDataCityList mDataCityList1 =new MDataCityList();
//        MDataCityList mDataCityList2 =new MDataCityList();
//        MDataCityList mDataCityList3 =new MDataCityList();
//        MDataCityList mDataCityList4 =new MDataCityList();
//        MDataCityList mDataCityList5 =new MDataCityList();
//        MDataCityList mDataCityList6 =new MDataCityList();
//        MDataCityList mDataCityList7 =new MDataCityList();
//        MDataCityList mDataCityList8 =new MDataCityList();
//
//        MLocality mLocality1=new MLocality();
//        MLocality mLocality2=new MLocality();
//        MLocality mLocality3=new MLocality();
//        MLocality mLocality4=new MLocality();
//        MLocality mLocality5=new MLocality();
//        mLocality1.setLocalityId(1);
//        mLocality1.setLocalityName("ChandniChowk");
//        mLocality2.setLocalityId(2);
//        mLocality2.setLocalityName("South Delhi");
//        mLocality3.setLocalityId(3);
//        mLocality3.setLocalityName("Dwarka");
//        mLocality4.setLocalityId(4);
//        mLocality4.setLocalityName("JanakPuri");
//        mLocality5.setLocalityId(5);
//        mLocality5.setLocalityName("Karol Bagh");
//        List<MLocality> mLocalityList=new ArrayList<>();
//        mLocalityList.add(mLocality1);
//        mLocalityList.add(mLocality2);
//        mLocalityList.add(mLocality3);
//        mLocalityList.add(mLocality4);
//        mLocalityList.add(mLocality5);
//       // MDataCityList mDataCityList9 =new MDataCityList();
//        mDataCityList1.setCityId(1);
//        mDataCityList1.setCityName("Ambikapur");
//        mDataCityList2.setCityId(2);
//        mDataCityList2.setCityName("Ranchi");
//        mDataCityList3.setCityId(3);
//        mDataCityList3.setCityName("Bilaspur");
//        mDataCityList4.setCityId(4);
//        mDataCityList4.setCityName("Delhi");
//        mDataCityList4.setmLocalitList(mLocalityList);
//        mDataCityList5.setCityId(5);
//        mDataCityList5.setCityName("Kolkata");
//        mDataCityList6.setCityId(6);
//        mDataCityList6.setCityName("Bhilai");
//        mDataCityList7.setCityId(7);
//        mDataCityList7.setCityName("Bokaro");
//        mDataCityList8.setCityId(8);
//        mDataCityList8.setCityName("Raipur");
//
//        //mDataCityList4.set
//
//        mDataCityListList.add(mDataCityList1);
//        mDataCityListList.add(mDataCityList2);
//        mDataCityListList.add(mDataCityList3);
//        mDataCityListList.add(mDataCityList4);
//        mDataCityListList.add(mDataCityList5);
//        mDataCityListList.add(mDataCityList6);
//        mDataCityListList.add(mDataCityList7);
//        mDataCityListList.add(mDataCityList8);
   //     return cityListRepository.saveAll(mDataCityListList);
    }

    @PostMapping("/mongodb/merchantList")
    public MMerchantList serviceForMerchantList(@RequestBody MCityandLocality mCityandLocality)
    {
      return servicesMerchantList.servicesMerchantList(mCityandLocality);
  //@RequestBody MCityandLocality mCityandLocality
       //  Ambikapur
//        MMerchantList mMerchantList=new MMerchantList();
//        List<MDataMerchant> mDataMerchantList =new ArrayList<>();
//
//        MDataMerchant mDataMerchant =new MDataMerchant();
//        mDataMerchant.setPartnersId("011");
//        mDataMerchant.setPriority(1);
//        mDataMerchant.setCityId(1);
//        mDataMerchant.setLocalityId(121);
//        mDataMerchant.setDeliveryCharge(10.0);
//        mDataMerchant.setPartnersName("Apna Laundary");
//        mDataMerchant.setPartnersAddress("BauriPara, Ambikapur, Chattisgarh");
//        mDataMerchant.setAvgNormalPrice(20.0);
//        mDataMerchant.setAvgDryLaudaryPrice(70.0);
//        mDataMerchant.setPartnersNumber("9191234563");
//        mDataMerchantList.add(mDataMerchant);
//
//        mMerchantList.setCityId(1);
//        mMerchantList.setLocalityId(121);
//        mMerchantList.setmDataMerchants(mDataMerchantList);

        // Delhi
  //      MMerchantList mMerchantList=new MMerchantList();
   //     List<MDataMerchant> mDataMerchantList =new ArrayList<>();
        //Merchant 1
//        MDataMerchant mDataMerchant =new MDataMerchant();
//        mDataMerchant.setPartnersId("9191234563");
//        mDataMerchant.setPriority(1);
//        mDataMerchant.setCityId(4);
//        mDataMerchant.setLocalityId(421);
//        mDataMerchant.setDeliveryCharge(10.0);
//        mDataMerchant.setPartnersName("Easy Laundary");
//        mDataMerchant.setPartnersAddress("BauriPara, Janakpuri, Delhi-8001");
//        mDataMerchant.setAvgNormalPrice(20.0);
//        mDataMerchant.setAvgDryLaudaryPrice(70.0);
//        mDataMerchant.setPartnersNumber("919123456");
//
//        //Merchant 2
//        MDataMerchant mDataMerchant1 =new MDataMerchant();
//        mDataMerchant1.setPartnersId("9191234563");
//        mDataMerchant1.setPriority(1);
//        mDataMerchant1.setCityId(4);
//        mDataMerchant1.setLocalityId(421);
//        mDataMerchant.setDeliveryCharge(10.0);
//        mDataMerchant1.setPartnersName("Apna Dhobi");
//        mDataMerchant1.setPartnersAddress("Gandhi Nagar, Dwarka, Delhi -4001");
//        mDataMerchant1.setAvgNormalPrice(20.0);
//        mDataMerchant1.setAvgDryLaudaryPrice(70.0);
//        mDataMerchant1.setPartnersNumber("91912345");
//
//        //Merchant 3
//        MDataMerchant mDataMerchant2 =new MDataMerchant();
//        mDataMerchant2.setPartnersId("9191234563");
//        mDataMerchant2.setPriority(1);
//        mDataMerchant2.setCityId(4);
//        mDataMerchant2.setLocalityId(421);
//        mDataMerchant2.setDeliveryCharge(10.0);
//        mDataMerchant2.setPartnersName("Clean Dry Cleaning");
//        mDataMerchant2.setPartnersAddress("Bariatu Nagar, south, Delhi -4001");
//        mDataMerchant2.setAvgNormalPrice(20.0);
//        mDataMerchant2.setAvgDryLaudaryPrice(70.0);
//        mDataMerchant2.setPartnersNumber("91912345");
//
//        mDataMerchantList.add(mDataMerchant);
//        mDataMerchantList.add(mDataMerchant1);
//        mDataMerchantList.add(mDataMerchant2);
//        mMerchantList.setCityId(4);
//        mMerchantList.setLocalityId(421);
//        mMerchantList.setmDataMerchants(mDataMerchantList);
 //       return merchantListRepository.save(mMerchantList);
    }

    @GetMapping("/mongodb/newHomePage")
    public NewMHomepage serviceForNewHomePage(@RequestBody MPartnerId mPartnerId)
    {
        //@RequestBody MPartnerId mPartnerId
      //  NewMDataHomePage
        //MMobileNo mMobileNo
       return servicesNewHomePage.servicesNewHomePage(mPartnerId);
//        NewMDataHomePage mDataHomePage=new NewMDataHomePage();
//        mDataHomePage.setPartnersid("9191234563");
//        mDataHomePage.setPartnersContact("91912345");
//        mDataHomePage.setMinPriceForOrder(30.0);
//        List<NewMForMensWear> mensWearList=new ArrayList<>();
//        List<NewMForWomensWear> womensWearList=new ArrayList<>();
//        List<NewMForOtherWear> otherWearList=new ArrayList<>();
//
//        NewMForMensWear mForMensWear1=new NewMForMensWear();
//        NewMForMensWear mForMensWear2=new NewMForMensWear();
//        NewMForMensWear mForMensWear3=new NewMForMensWear();
//        NewMForMensWear mForMensWear4=new NewMForMensWear();
//        NewMForMensWear mForMensWear5=new NewMForMensWear();
//        NewMForMensWear mForMensWear6=new NewMForMensWear();
//        NewMForMensWear mForMensWear7=new NewMForMensWear();
//
//        NewMForWomensWear mForWomensWear1=new NewMForWomensWear();
//        NewMForWomensWear mForWomensWear2=new NewMForWomensWear();
//        NewMForWomensWear mForWomensWear3=new NewMForWomensWear();
//        NewMForWomensWear mForWomensWear4=new NewMForWomensWear();
//        NewMForWomensWear mForWomensWear5=new NewMForWomensWear();
//        NewMForWomensWear mForWomensWear6=new NewMForWomensWear();
//        NewMForWomensWear mForWomensWear7=new NewMForWomensWear();
//
//        NewMForOtherWear mForOtherWear1=new NewMForOtherWear();
//        NewMForOtherWear mForOtherWear2=new NewMForOtherWear();
//        NewMForOtherWear mForOtherWear3=new NewMForOtherWear();
//        NewMForOtherWear mForOtherWear4=new NewMForOtherWear();
//        NewMForOtherWear mForOtherWear5=new NewMForOtherWear();
//
//        ModelPriceDetails modelPriceDetails =new ModelPriceDetails();
//        modelPriceDetails.setNormalCleanPrice("20");
//        modelPriceDetails.setDryCleanPrice("70");
//        modelPriceDetails.setNormalCleanDiscountedPrice("10");
//        modelPriceDetails.setDryCleanDiscountedPrice("50");
//        modelPriceDetails.setNormalIronPrice("7");
//        modelPriceDetails.setSteamIronPrice("7");
//        //For MensWear
//
//        mForMensWear1.setItemId("MJeans");
//        mForMensWear1.setMensWeartitle("Jeans");
//        mForMensWear1.setMensWearimageurl("https://res.cloudinary.com/drbeg6afu/image/upload/v1568203241/jeans_og9ssl.jpg");
//        mForMensWear1.setPriceDetails(modelPriceDetails);
//
//        mForMensWear2.setItemId("MTshirt");
//        mForMensWear2.setMensWeartitle("T-Shirt");
//        mForMensWear2.setMensWearimageurl("https://res.cloudinary.com/drbeg6afu/image/upload/v1568198632/t_shirt_vuqt8a.jpg");
//        mForMensWear2.setPriceDetails(modelPriceDetails);
//
//        mForMensWear3.setItemId("MPant");
//        mForMensWear3.setMensWeartitle("Pants");
//        mForMensWear3.setMensWearimageurl("https://res.cloudinary.com/drbeg6afu/image/upload/w_600/v1568198191/pant_tehceu.jpg");
//        mForMensWear3.setPriceDetails(modelPriceDetails);
//
//        mForMensWear4.setItemId("MShirt");
//        mForMensWear4.setMensWeartitle("Shirt");
//        mForMensWear4.setPriceDetails(modelPriceDetails);
//
//
//        mForMensWear5.setItemId("MSweater");
//        mForMensWear5.setMensWeartitle("Sweater");
//        mForMensWear5.setMensWearimageurl("https://res.cloudinary.com/drbeg6afu/image/upload/v1568204062/sweater_su8ask.jpg");
//        mForMensWear5.setPriceDetails(modelPriceDetails);
//
//        mForMensWear6.setItemId("MBlajer");
//        mForMensWear6.setMensWeartitle("Blajer");
//        mForMensWear6.setMensWearimageurl("https://res.cloudinary.com/drbeg6afu/image/upload/v1568199328/blajer_yncqlr.jpg");
//        mForMensWear6.setPriceDetails(modelPriceDetails);
//
//        mForMensWear7.setItemId("MCoat");
//        mForMensWear7.setMensWeartitle("Coat");
//        mForMensWear7.setMensWearimageurl("https://res.cloudinary.com/drbeg6afu/image/upload/v1568199137/coat_jbdtso.jpg");
//        mForMensWear7.setPriceDetails(modelPriceDetails);
//
//        mensWearList.add(mForMensWear1);
//        mensWearList.add(mForMensWear2);
//        mensWearList.add(mForMensWear3);
//        mensWearList.add(mForMensWear4);
//        mensWearList.add(mForMensWear5);
//        mensWearList.add(mForMensWear6);
//        mensWearList.add(mForMensWear7);
//
//        //For WomensWear
//
//        mForWomensWear1.setItemId("W-Tshirt");
//        mForWomensWear1.setWomensWeartitle("T-Shirt");
//        mForWomensWear1.setWomensWearimageurl("https://res.cloudinary.com/drbeg6afu/image/upload/v1568199591/womenst_shirt_ndij0t.jpg");
//        mForWomensWear1.setPriceDetails(modelPriceDetails);
//
//        mForWomensWear2.setItemId("WJeans");
//        mForWomensWear2.setWomensWeartitle("Jeans");
//        mForWomensWear2.setWomensWearimageurl("https://res.cloudinary.com/drbeg6afu/image/upload/v1568204303/womensjeans_tpk21i.jpg");
//        mForWomensWear2.setPriceDetails(modelPriceDetails);
//
//        mForWomensWear3.setItemId("WLeggins");
//        mForWomensWear3.setWomensWeartitle("Leggins");
//        mForWomensWear3.setWomensWearimageurl("https://res.cloudinary.com/drbeg6afu/image/upload/w_600/v1568200346/leggins_gbqb7r.jpg");
//        mForWomensWear3.setPriceDetails(modelPriceDetails);
//
//        mForWomensWear4.setItemId("WSaree");
//        mForWomensWear4.setWomensWeartitle("Saree");
//        mForWomensWear4.setWomensWearimageurl("https://res.cloudinary.com/drbeg6afu/image/upload/w_600/v1568201566/sarees_eoooqs.jpg");
//        mForWomensWear4.setPriceDetails(modelPriceDetails);
//
//        mForWomensWear5.setItemId("WJacket");
//        mForWomensWear5.setWomensWeartitle("Jacket");
//        mForWomensWear5.setWomensWearimageurl("https://res.cloudinary.com/drbeg6afu/image/upload/w_600/v1568204773/jacket_zejmoe.jpg");
//        mForWomensWear5.setPriceDetails(modelPriceDetails);
//
//        mForWomensWear6.setItemId("WTops");
//        mForWomensWear6.setWomensWeartitle("Tops");
//        mForWomensWear6.setWomensWearimageurl("https://res.cloudinary.com/drbeg6afu/image/upload/w_500/v1568202024/tops_cwf99d.webp");
//        mForWomensWear6.setPriceDetails(modelPriceDetails);
//
//        mForWomensWear7.setItemId("WKurti");
//        mForWomensWear7.setWomensWeartitle("Kurti");
//        mForWomensWear7.setWomensWearimageurl("https://res.cloudinary.com/drbeg6afu/image/upload/v1568201096/kurtisnew_vghqp2.jpg");
//        mForWomensWear7.setPriceDetails(modelPriceDetails);
//
//        womensWearList.add(mForWomensWear1);
//        womensWearList.add(mForWomensWear2);
//        womensWearList.add(mForWomensWear3);
//        womensWearList.add(mForWomensWear4);
//        womensWearList.add(mForWomensWear5);
//        womensWearList.add(mForWomensWear6);
//        womensWearList.add(mForWomensWear7);
//
//        //For OthersWear
//        mForOtherWear1.setItemId("OBlanket");
//        mForOtherWear1.setOthersWeartitle("Blanket");
//        mForOtherWear1.setOthersimageurl("https://res.cloudinary.com/drbeg6afu/image/upload/v1568205060/blanket_bmrdvh.jpg");
//        mForOtherWear1.setPriceDetails(modelPriceDetails);
//
//        mForOtherWear2.setItemId("OBedsheet");
//        mForOtherWear2.setOthersWeartitle("Bed-Sheet");
//        mForOtherWear2.setOthersimageurl("https://res.cloudinary.com/drbeg6afu/image/upload/v1568202475/bed_sheet_rvkr7t.jpg");
//        mForOtherWear2.setPriceDetails(modelPriceDetails);
//
//        mForOtherWear3.setItemId("OPillow");
//        mForOtherWear3.setOthersWeartitle("Pillow");
//        mForOtherWear3.setOthersimageurl("https://res.cloudinary.com/drbeg6afu/image/upload/v1568205180/pillowcover_xlyvrw.jpg");
//        mForOtherWear3.setPriceDetails(modelPriceDetails);
//
//        mForOtherWear4.setItemId("OCurtains");
//        mForOtherWear4.setOthersWeartitle("Curtains");
//        mForOtherWear4.setOthersimageurl("https://res.cloudinary.com/drbeg6afu/image/upload/v1568202924/curtains_sbkace.jpg");
//        mForOtherWear4.setPriceDetails(modelPriceDetails);
//
//        mForOtherWear5.setItemId("OSofacover");
//        mForOtherWear5.setOthersWeartitle("Sofacover");
//        mForOtherWear5.setOthersimageurl("https://res.cloudinary.com/drbeg6afu/image/upload/v1568202811/sofacover_pguwwl.jpg");
//        mForOtherWear5.setPriceDetails(modelPriceDetails);
//
//        otherWearList.add(mForOtherWear1);
//        otherWearList.add(mForOtherWear2);
//        otherWearList.add(mForOtherWear3);
//        otherWearList.add(mForOtherWear4);
//        otherWearList.add(mForOtherWear5);
//
//        mDataHomePage.setMensWearList(mensWearList);
//        mDataHomePage.setWomensWearList(womensWearList);
//        mDataHomePage.setOtherWearList(otherWearList);
//        return   newHomePageRepository.save(mDataHomePage);
    }
}
