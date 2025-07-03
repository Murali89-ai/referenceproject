package com.wu.brwallet.customer.profile.util;

import org.springframework.stereotype.Component;

@Component
public class PingHttpStatusUtility {


   private boolean statusCode=false;

    public  void checkStatusCodeIs409(boolean code){
        if(code){
          statusCode= true;
        }
        else{
         statusCode= false;
        }
    }

    public boolean checkStatusCode409(){
        return statusCode;
    }
}
