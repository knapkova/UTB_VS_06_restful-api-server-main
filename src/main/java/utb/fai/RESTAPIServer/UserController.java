package utb.fai.RESTAPIServer;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;


    @GetMapping("/users")
    public List<MyUser> getAllUsers() {
        // TODO: implement logic of /users endpoint
        return null;
    }

    @GetMapping("/getUser")
    public ResponseEntity<MyUser> getUserById(@RequestParam Long id) {
        // TODO: implement logic of /getUser endpoint
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/createUser")
    public ResponseEntity<MyUser> createUser(@RequestBody MyUser newUser) {
        if (newUser.isUserDataValid(newUser.getPhoneNumber(), newUser.getEmail())) {
            MyUser savedUser = userRepository.save(newUser);
            return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
        } else {

            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    }

    // TODO: Define remaining endpoints in the same way. For id parameter use annotation @RequestParam with name "id" and for MyUser structure use @RequestBody.

}
