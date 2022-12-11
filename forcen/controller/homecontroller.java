package uadb.edu.forcen.forcen.controller;
import uadb.edu.forcen.*;
import org.springframework.web.bind.annotation.GetServer;
import org.springframework.stereotype.controller;
import org.springframework.boot.origin.*;
import org.slf4j.*;
import org.springframework.http.server.*;
@controller

public class hommecontroller {
	@Getserver
	private String name;
	private String nickname;
	private int age= " ";
	public String index ()
		
	{
		retur "home";
		
	}
	public String  getname()
	{
		return "name";
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	
}