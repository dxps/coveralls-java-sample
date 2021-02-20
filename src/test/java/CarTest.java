
import io.dxps.coveralls.javasample.domain.car.Car;
import io.dxps.coveralls.javasample.domain.car.Engine;
import io.dxps.coveralls.javasample.domain.exceptions.EngineException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class CarTest {

    @Test
    @DisplayName("Car creation & engine on/off")
    void t1() {
        String id = "1";
        String engineName = "SomeEngine";
        String carBrand = "SomeBrand", carModel = "SomeModel";
        Engine engine = new Engine(id, engineName);
        Car car = new Car(id, carBrand, carModel, engine);

        assertNotNull(engine);
        Assertions.assertEquals(id, engine.getId());
        Assertions.assertEquals(engineName, engine.getName());

        assertNotNull(car);
        Assertions.assertEquals(id, car.getId());
        Assertions.assertEquals(carBrand, car.getBrand());
        Assertions.assertEquals(carModel, car.getModel());
        Assertions.assertEquals(engine, car.getEngine());

        try {
            car.turnEngineOn();
        } catch (EngineException e) {
            Assertions.fail("Failed to turn engine on.", e);
        }

        try {
            car.enableDriveMode();
            Assertions.fail("Engine must reject enabling drive mode since it's not yet warmed up.");
        } catch (EngineException e) {
            // expected, so it's fine
        }

        try {
            Thread.sleep(Engine.SECONDS_TO_WARM_UP * 1000);
        } catch (InterruptedException ignored) {
        }

        try {
            car.enableDriveMode();

        } catch (EngineException e) {
            Assertions.fail("Engine failed to enable drive mode.", e);
        }

        car.turnEngineOff();

        Assertions.assertTrue(car.isTurnedOff(), "Car should be turned off after the engine has been turned off");

    }

}
