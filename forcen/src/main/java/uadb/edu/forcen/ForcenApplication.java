package uadb.edu.forcen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;
import org.springframework.boot.autoconfigure.web.*;
import org.springframework.boot.autoconfigure.web.client.*;
@Service
public class ForcenApplication {
	public static void main(String args[]) {
		SpringApplication.run(ForcenApplication.class,args);
	}
}

   