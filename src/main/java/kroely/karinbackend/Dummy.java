package kroely.karinbackend;


import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Dummy {

    @GetMapping("/ok")
    public ResponseEntity<String> signup() {
        return ResponseEntity.ok("Working");
    }
}
