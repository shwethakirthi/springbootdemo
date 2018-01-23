package com.cts.passengerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages={"com.cts.passengerservice", "com.cts.passengerservice.api"})
public class Swagger2SpringBoot
  implements CommandLineRunner
{
  public void run(String... arg0)
    throws Exception
  {
    if ((arg0.length > 0) && (arg0[0].equals("exitcode"))) {
      throw new ExitException();
    }
  }
  
  public static void main(String[] args)
    throws Exception
  {
    new SpringApplication(new Object[] { Swagger2SpringBoot.class }).run(args);
  }
  
  class ExitException
    extends RuntimeException
    implements ExitCodeGenerator
  {
    private static final long serialVersionUID = 1L;
    
    ExitException() {}
    
    public int getExitCode()
    {
      return 10;
    }
  }
}
