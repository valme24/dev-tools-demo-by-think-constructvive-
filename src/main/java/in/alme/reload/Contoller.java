package in.alme.reload;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class Contoller {




    @GetMapping("/{empId}")
public String getEmpId(@PathVariable("empId") String empId){
        return "the data is found for emloyee id is  :  " +empId +"is this ";

    }

}
