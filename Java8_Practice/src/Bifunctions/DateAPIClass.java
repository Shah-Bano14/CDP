package Bifunctions;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;
import java.util.function.Supplier;

import org.testng.annotations.Test;

import io.netty.util.IntSupplier;

public class DateAPIClass {

	
	@Test
	public void yesterdayDate()
	{
		String givenDate="2020-04-02";
		LocalDate date=LocalDate.of(2020, 04, 02);
		LocalDate given=LocalDate.parse(givenDate);
		if(date.equals(given))
			System.out.println("true");
	}
	@Test
	public void thursdayDate()
	{
		
		Supplier<LocalDate> s=()->
		{
			String givenDate="2020-04-09";
			LocalDate given=LocalDate.parse(givenDate);
			return given;
		};
		System.out.println(s.get());
		
	}
	
	@Test
	public void currentTime()
	{
		
		Supplier<LocalTime> s=()->
		{
			
			LocalTime given=LocalTime.now();
			return given;
		};
		System.out.println(s.get());
		
	}
	@Test
	public void birthdayAge()
	{
		
		Supplier<Period> s=()->
		{
			String givenDate="2000-04-09";
			LocalDate given=LocalDate.parse(givenDate);
			LocalDate current=LocalDate.now();
			Period p=Period.between(given, current);
			return p;
		};
		System.out.println(s.get());
		
	}
}
