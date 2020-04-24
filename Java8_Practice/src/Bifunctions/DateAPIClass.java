package Bifunctions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DateAPIClass {

	@Test
	public void yesterdayDate() {
		LocalDate today = LocalDate.now();
		LocalDate yesterday = today.minusDays(1);
		LocalDate given = LocalDate.of(2020, 04, 20);
		BiPredicate<LocalDate, LocalDate> p = (x, y) -> {
			return yesterday.equals(given);
		};

		Assert.assertEquals(p.test(yesterday, given), true);
	}

	@Test
	public void thursdayDate() {

		Supplier<LocalDate> s = () -> {
			LocalDate date = LocalDate.now().plus(1, ChronoUnit.WEEKS);

			LocalDate newDate = date;
			if (String.valueOf(newDate.getDayOfWeek()).equals("THURSDAY"))
				return newDate;
			else {
				for (int i = 1; i <= 7; i++) {
					newDate = newDate.plus(1, ChronoUnit.DAYS);
					// System.out.println(newDate.getDayOfWeek());
					if (String.valueOf(newDate.getDayOfWeek()).equals("THURSDAY"))
						return newDate;
				}
			}
			return date;

		};
		System.out.println(s.get());

	}

	@Test
	public void currentTime() {

		Supplier<ZonedDateTime> s = () -> {
			ZoneId estZone = ZoneId.of("America/New_York");
			ZonedDateTime currentDateAndTime = LocalDateTime.now().atZone(estZone);

			return currentDateAndTime;
		};
		System.out.println(s.get().getHour()+":"+s.get().getMinute()+":"+s.get().getSecond());

	}

	@Test
	public void birthdayAge() {

		Supplier<Period> s = () -> {

			LocalDate given = LocalDate.of(2000, 8, 14);
			LocalDate current = LocalDate.now();
			Period p = Period.between(given, current);
			return p;
		};
		System.out.println(s.get().getDays() + " " + s.get().getMonths() + " " + s.get().getYears());

	}
}
