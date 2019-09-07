package com.dhobi.backend.model;

import com.dhobi.backend.Repository.AddressListRepository;
import com.dhobi.backend.Repository.PaymentSummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceAddressList {
    @Autowired
    AddressListRepository addressListRepository;
    @Autowired
    PaymentSummaryRepository paymentSummaryRepository;

    public MResponseAddress setAddressListRepository(MAddress mAddress) {
        MResponseAddress mResponseAddress = new MResponseAddress();
        List<String> addresslistString = new ArrayList<>();
        if (mAddress.getAddress().isEmpty()) {
            //Executed when new AddressList is required;
            if (addressListRepository.count() == 0) {
                mResponseAddress.setCode(500);
                mResponseAddress.setAddresslist(null);
            } else {
                mResponseAddress.setCode(200);
                for (MAddress mAddressnew : addressListRepository.findAll()) {
                    addresslistString.add(mAddressnew.getAddress());
                }
                mResponseAddress.setAddresslist(addresslistString);
            }
        } else {
            //Executed when new Address is saved and addresslist is required;
            addressListRepository.save(mAddress);
            mResponseAddress.setCode(200);
            for (MAddress mAddressnew : addressListRepository.findAll()) {
                addresslistString.add(mAddressnew.getAddress());
            }
            mResponseAddress.setAddresslist(addresslistString);
        }


        return mResponseAddress;

    }
}
   /* public MResponseAddress setAddressListRepository(MLogin mLogin)
    {
        MResponseAddress mResponseAddress = new MResponseAddress();
        List<MPayment> mPaymentList = paymentSummaryRepository.findUserOrderDetails(mLogin.getMobileno(),mLogin.getPassword());
        List<MUserAddress> mUserAddressList=new ArrayList<>();

        if(mPaymentList==null || mPaymentList.size() == 0)
        {
            mResponseAddress.setCode(500);
            mResponseAddress.setmUserAddressList(mUserAddressList);
        }
        else if(mPaymentList.size()==1)
        {
            MUserAddress mUserAddress = mPaymentList.get(0).getmUserAddress();
            mUserAddressList.add(mUserAddress);
            mResponseAddress.setCode(200);
            mResponseAddress.setmUserAddressList(mUserAddressList);
        }
       else {
            for(int i=0; i<mPaymentList.size();i++)
            {
                MUserAddress mUserAddress = mPaymentList.get(i).getmUserAddress();
                if(mUserAddressList.size()!=0)
                {
                Boolean exist=false;
                String strmUserAddress_1=mUserAddress.getFlatnoOrStreetNo()+mUserAddress.getLocality()+mUserAddress.getCity()+mUserAddress.getPincode();
                MUserAddress mUserAddress2=null;
                String strmUserAddress_2=null;
               // .getFlatnoOrStreetNo());

                for(int j=0;j<(mPaymentList.size());j++)
              {
                   mUserAddress2 = mPaymentList.get(j).getmUserAddress();
                   strmUserAddress_2=mUserAddress2.getFlatnoOrStreetNo()+mUserAddress2.getLocality()+mUserAddress2.getCity()+mUserAddress2.getPincode();

                  if(i != j && strmUserAddress_1.equals(strmUserAddress_2))
                  {
                     exist=true;
                  }

              }
                if(!exist)
                {
                    mUserAddressList.add(mUserAddress);
                }
                }
                else
                {
                    mUserAddressList.add(mUserAddress);
                }

            }
            mResponseAddress.setCode(200);
            mResponseAddress.setmUserAddressList(mUserAddressList);
        }

       // MAddress mAddress=new MAddress();
       // MPayment mPayment=
       // if()
        return mResponseAddress;
    }
} */
