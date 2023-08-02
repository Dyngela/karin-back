package kroely.karinbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KarInBackendApplication {

    public static void main(String[] args) {
//        JsonElement result 		= null;
//        Hashtable options 	= null;
////        5a3916902787823212LVXhW3uD0EAUCR
//        try {
//            Api tc = new Api(new LoginPasswordAuth("saspaulkroelyanimation_1", "Weupu2018*"), options);
//            HashMap<String, String> hashMap = new HashMap<>();
//            hashMap.put("from", "2023-07-21 00:00:00");
//            hashMap.put("to", "2023-07-23 23:59:00");
//            hashMap.put("type", "IN");
////            result = tc.call("cdr.export_async",  hashMap, null);
//            result = tc.call("jobs.get",  "5a3916902787823212LVXhW3uD0EAUCR");
////            result = tc.call("cdr.export_async",  "IN", "COUNT", "2023-07-21 00:00:00", "2023-07-23 23:59:00", 9999);
//            System.out.println(result);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        SpringApplication.run(KarInBackendApplication.class, args);


    }


}
