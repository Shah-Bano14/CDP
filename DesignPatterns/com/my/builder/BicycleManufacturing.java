package com.my.builder;

public class BicycleManufacturing {

	private boolean gears;
	private boolean doubleStands;
	private boolean doubleSeats;
	private boolean carrier;
	// mandatory feature
	private boolean steering;

	BicycleManufacturing(Builder builder) {
		this.gears = builder.gears;
		this.doubleSeats = builder.doubleSeats;
		this.doubleStands = builder.doubleStands;
		this.carrier = builder.carrier;
		this.steering = builder.steering;
	}

	// String representation of object
	@Override
	public String toString() {
		return "BicycleManufacturing [gears=" + gears + ", doubleStands=" + doubleStands + ", doubleSeats="
				+ doubleSeats + ", carrier=" + carrier + ", steering=" + steering + "]";
	}

	public static class Builder {
		private boolean gears;
		private boolean doubleStands;
		private boolean doubleSeats;
		private boolean carrier;
		// mandatory feature
		private boolean steering;

		Builder(boolean steering) {
			this.steering = steering;

		}

		public Builder setGearsSpec(boolean setGears) {
			this.gears = setGears;
			return this;
		}

		public Builder setdoubleStandsSpec(boolean setDoubleStands) {
			this.doubleStands = setDoubleStands;
			return this;
		}

		public Builder setdoubleSeatsSpec(boolean setDoubleSeats) {
			this.doubleSeats = setDoubleSeats;

			return this;
		}

		public Builder setcarrierSpec(boolean setCarrier) {
			this.carrier = setCarrier;
			return this;
		}

		public BicycleManufacturing build() {

			return new BicycleManufacturing(this);

		}

	}
}
