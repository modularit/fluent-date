package org.exparity.dates.en;

import static org.exparity.dates.en.FluentDate.*;
import static org.exparity.hamcrest.date.DateMatchers.isDay;
import static org.junit.Assert.assertThat;

import java.time.Month;

import org.junit.Test;

/**
 * Unit test for the {@link FluentDate} class
 *
 * @author Stewart Bissett
 */
public class FluentDateTest {

	@Test
	public void canCreateDateInJanuary() {
		assertThat(JAN(1, 2014), isDay(2014, Month.JANUARY, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInJanuary() {
		JAN(32, 2014);
	}

	@Test
	public void canCreateDateInFebruary() {
		assertThat(FEB(1, 2014), isDay(2014, Month.FEBRUARY, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnDateInFebruary() {
		FEB(29, 2014);
	}

	@Test
	public void canCreateDateInMarch() {
		assertThat(MAR(1, 2014), isDay(2014, Month.MARCH, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInMarch() {
		MAR(32, 2014);
	}

	@Test
	public void canCreateDateInApril() {
		assertThat(APR(1, 2014), isDay(2014, Month.APRIL, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInApril() {
		APR(31, 2014);
	}

	@Test
	public void canCreateDateInMay() {
		assertThat(MAY(1, 2014), isDay(2014, Month.MAY, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInMay() {
		MAY(32, 2014);
	}

	@Test
	public void canCreateDateInJune() {
		assertThat(JUN(1, 2014), isDay(2014, Month.JUNE, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInJune() {
		JUN(31, 2014);
	}

	@Test
	public void canCreateDateInJuly() {
		assertThat(JUL(1, 2014), isDay(2014, Month.JULY, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInJuly() {
		JUL(32, 2014);
	}

	@Test
	public void canCreateDateInAugust() {
		assertThat(AUG(1, 2014), isDay(2014, Month.AUGUST, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInAugust() {
		AUG(32, 2014);
	}

	@Test
	public void canCreateDateInSeptember() {
		assertThat(SEP(1, 2014), isDay(2014, Month.SEPTEMBER, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInSeptember() {
		SEP(31, 2014);
	}

	@Test
	public void canCreateDateInOctober() {
		assertThat(OCT(1, 2014), isDay(2014, Month.OCTOBER, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInOctober() {
		OCT(32, 2014);
	}

	@Test
	public void canCreateDateInNovember() {
		assertThat(NOV(1, 2014), isDay(2014, Month.NOVEMBER, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInNovember() {
		NOV(31, 2014);
	}

	@Test
	public void canCreateDateInDecember() {
		assertThat(DEC(1, 2014), isDay(2014, Month.DECEMBER, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInDecember() {
		DEC(32, 2014);
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnZeroDate() {
		assertThat(JAN(0, 2014), isDay(2014, Month.JANUARY, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnNegativeDate() {
		assertThat(JAN(-1, 2014), isDay(2014, Month.JANUARY, 1));
	}
}
