package Controller;

import Entity.Userdetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class NotificationController {
@GetMapping("/Notfi")
    public Map<String,String> Notification(@RequestBody Userdetails userdetails){
    Map<String,String> hash = new HashMap<>();

    hash.put("message", "User " + userdetails.getName() + "(" + userdetails.getEmail() + ") has been successfully registered");
    return hash;
}


}
