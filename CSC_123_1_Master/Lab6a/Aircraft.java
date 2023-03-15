// Title: Lab 6a
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 02/17/2023

public class Aircraft {
    public String manufacturer;
    public int maxSpeed;
    public int range;
    public Aircraft(String manufacturer, int maxSpeed, int range) {
        this.manufacturer = manufacturer;
        this.maxSpeed = maxSpeed;
        this.range = range;
    }
}
 class HeavierThanAirAircraft extends Aircraft {
    public int wingspan;
    public int maxAltitude;
    public int maxPayload;
    public HeavierThanAirAircraft(String manufacturer, int maxSpeed, int range, int wingspan, int maxAltitude, int maxPayload) {
        super(manufacturer, maxSpeed, range);
        this.wingspan = wingspan;
        this.maxAltitude = maxAltitude;
        this.maxPayload = maxPayload;
    }
}
 class FixedWingAircraft extends HeavierThanAirAircraft {
    public int engines;
    public int maxFuelCapacity;
    public boolean hasWeaponSystem;
    public FixedWingAircraft(String manufacturer, int maxSpeed, int range, int wingspan, int maxAltitude, int maxPayload, int engines, int maxFuelCapacity, boolean hasWeaponSystem) {
        super(manufacturer, maxSpeed, range, wingspan, maxAltitude, maxPayload);
        this.engines = engines;
        this.maxFuelCapacity = maxFuelCapacity;
        this.hasWeaponSystem = hasWeaponSystem;
    }
}
 class Airliner extends FixedWingAircraft {
    public int passengerCapacity;
    public boolean hasEntertainmentSystem;
    public boolean hasBusinessClass;
    public Airliner(String manufacturer, int maxSpeed, int range, int wingspan, int maxAltitude, int maxPayload, int engines, int maxFuelCapacity, boolean hasWeaponSystem, int passengerCapacity, boolean hasEntertainmentSystem, boolean hasBusinessClass) {
        super(manufacturer, maxSpeed, range, wingspan, maxAltitude, maxPayload, engines, maxFuelCapacity, hasWeaponSystem);
        this.passengerCapacity = passengerCapacity;
        this.hasEntertainmentSystem = hasEntertainmentSystem;
        this.hasBusinessClass = hasBusinessClass;
    }
}
 class MilitaryJet extends FixedWingAircraft {
    public String weaponry;
    public boolean hasStealthCapability;
    public int maxGForce;
    public MilitaryJet(String manufacturer, int maxSpeed, int range, int wingspan, int maxAltitude, int maxPayload, int engines, int maxFuelCapacity, boolean hasWeaponSystem, String weaponry, boolean hasStealthCapability, int maxGForce) {
        super(manufacturer, maxSpeed, range, wingspan, maxAltitude, maxPayload, engines, maxFuelCapacity, hasWeaponSystem);
        this.weaponry=weaponry;
        this.hasStealthCapability=hasStealthCapability;
        this.maxGForce=maxGForce;
    }
}
class PersonalJet extends FixedWingAircraft {
    public int passengerCapacity;
    public boolean hasWifi;
    public boolean hasMiniBar;
    public PersonalJet(String manufacturer, int maxSpeed, int range, int wingspan, int maxAltitude, int maxPayload, int engines, int maxFuelCapacity, boolean hasWeaponSystem, int passengerCapacity, boolean hasWifi, boolean hasMiniBar) {
        super(manufacturer, maxSpeed, range, wingspan, maxAltitude, maxPayload, engines, maxFuelCapacity, hasWeaponSystem);
        this.passengerCapacity = passengerCapacity;
        this.hasWifi = hasWifi;
        this.hasMiniBar = hasMiniBar;
    }
}
 class RotaryAircraft extends HeavierThanAirAircraft {
    public int rotorDiameter;
    public int maxTakeoffWeight;
    public boolean hasAutopilot;
    public RotaryAircraft(String manufacturer, int maxSpeed, int range, int rotorDiameter, int maxTakeoffWeight, int maxAltitude, int maxPayload, boolean hasAutopilot) {
        super(manufacturer, maxSpeed, range, rotorDiameter, maxAltitude, maxPayload);
        this.rotorDiameter = rotorDiameter;
        this.maxTakeoffWeight = maxTakeoffWeight;
        this.hasAutopilot = hasAutopilot;
    }
}
 class Helicopter extends RotaryAircraft {
    public int passengerCapacity;
    public boolean hasWinch;
    public boolean hasNightVision;
    public Helicopter(String manufacturer, int maxSpeed, int range, int rotorDiameter, int maxTakeoffWeight, int maxAltitude, int maxPayload, boolean hasAutopilot, int passengerCapacity, boolean hasWinch, boolean hasNightVision) {
        super(manufacturer, maxSpeed, range, rotorDiameter, maxTakeoffWeight, maxAltitude, maxPayload, hasAutopilot);
        this.passengerCapacity = passengerCapacity;
        this.hasWinch = hasWinch;
        this.hasNightVision = hasNightVision;
    }
}
class QuadcopterDrone extends RotaryAircraft {
    public int maxFlightTime;
    public int maxSpeed;
    public boolean hasCamera;
    public QuadcopterDrone(String manufacturer, int maxSpeed, int range, int rotorDiameter, int maxTakeoffWeight, int maxAltitude, int maxPayload, boolean hasAutopilot, int maxFlightTime, boolean hasCamera) {
        super(manufacturer, maxSpeed, range, rotorDiameter, maxTakeoffWeight, maxAltitude, maxPayload, hasAutopilot);
        this.maxFlightTime = maxFlightTime;
        this.hasCamera = hasCamera;
    }
}
 class HybridVerticalTakeOffAircraft extends HeavierThanAirAircraft {
    public int thrust;
    public int maxVerticalSpeed;
    public int maxHorizontalSpeed;
    public HybridVerticalTakeOffAircraft(String manufacturer, int maxSpeed, int range, int wingspan, int maxAltitude, int maxPayload, int thrust, int maxVerticalSpeed, int maxHorizontalSpeed) {
        super(manufacturer, maxSpeed, range, wingspan, maxAltitude, maxPayload);
        this.thrust = thrust;
        this.maxVerticalSpeed = maxVerticalSpeed;
        this.maxHorizontalSpeed = maxHorizontalSpeed;
    }
}
 class HarrierJumpJet extends HybridVerticalTakeOffAircraft {
    public String weaponry;
    public boolean hasVerticalLandingCapability;
    public boolean hasStealthCapability;
    public HarrierJumpJet(String manufacturer, int maxSpeed, int range, int wingspan, int maxAltitude, int maxPayload, int thrust, int maxVerticalSpeed, int maxHorizontalSpeed, String weaponry, boolean hasVerticalLandingCapability, boolean hasStealthCapability) {
        super(manufacturer, maxSpeed, range, wingspan, maxAltitude, maxPayload, thrust, maxVerticalSpeed, maxHorizontalSpeed);
        this.weaponry = weaponry;
        this.hasVerticalLandingCapability = hasVerticalLandingCapability;
        this.hasStealthCapability = hasStealthCapability;
        }
        }   
 class F35B extends HybridVerticalTakeOffAircraft {
        public boolean hasWeaponSystem;
        public int maxTakeoffWeight;
        public int maxFuelCapacity;
        public F35B(String manufacturer, int maxSpeed, int range, int wingspan, int maxAltitude, int maxPayload, int thrust, int maxVerticalSpeed, int maxHorizontalSpeed, boolean hasWeaponSystem, int maxTakeoffWeight, int maxFuelCapacity) {
            super(manufacturer, maxSpeed, range, wingspan, maxAltitude, maxPayload, thrust, maxVerticalSpeed, maxHorizontalSpeed);
            this.hasWeaponSystem = hasWeaponSystem;
            this.maxTakeoffWeight = maxTakeoffWeight;
            this.maxFuelCapacity = maxFuelCapacity;
        }
 }
 class LighterThanAirAircraft extends Aircraft {
    public String liftingGas;
    public boolean isPiloted;
    public LighterThanAirAircraft(String manufacturer, int maxSpeed, int range, String liftingGas, boolean isPiloted) {
        super(manufacturer, maxSpeed, range);
        this.liftingGas = liftingGas;
        this.isPiloted = isPiloted;
    }
}
 class Blimp extends LighterThanAirAircraft {
    public int length;
    public int maxPayload;
    public Blimp(String manufacturer, int maxSpeed, int range, String liftingGas, boolean isPiloted, int length, int maxPayload) {
        super(manufacturer, maxSpeed, range, liftingGas, isPiloted);
        this.length = length;
        this.maxPayload = maxPayload;
    }
}
 class HeliumFilledWeatherBalloon extends LighterThanAirAircraft {
    public int altitude;
    public HeliumFilledWeatherBalloon(String manufacturer, int maxSpeed, int range, String liftingGas, boolean isPiloted, int altitude) {
        super(manufacturer, maxSpeed, range, liftingGas, isPiloted);
        this.altitude = altitude;
    }
}
 class HotAirBalloon extends LighterThanAirAircraft {
    public int passengerCapacity;
    public boolean hasBasket;
    public HotAirBalloon(String manufacturer, int maxSpeed, int range, String liftingGas, boolean isPiloted, int passengerCapacity, boolean hasBasket) {
        super(manufacturer, maxSpeed, range, liftingGas, isPiloted);
        this.passengerCapacity = passengerCapacity;
        this.hasBasket = hasBasket;
    }
}