package com.testec.OLSoftware.inventory.serviceTest;

/**
 *
 * @author macru
 */

// Importa las bibliotecas necesarias
import com.testTec.OLSoftware.inventory.model.Device;
import com.testTec.OLSoftware.inventory.repository.DeviceRepository;
import com.testTec.OLSoftware.inventory.service.DeviceService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;
import org.mockito.Mockito;

@SpringBootTest
public class DeviceServiceTest {

    @InjectMocks
    private DeviceService deviceService;

    @Mock
    private DeviceRepository deviceRepository;

    @Test
    public void testObtenerDevicePorId() {
        // Configuración de datos de prueba y mock de repositorio
        Device deviceMock = new Device();
        deviceMock.setId(1);
        deviceMock.setName("Equipo_01");
        //deviceMock.setAssignedUser(1L);
        //deviceMock.setType(1L);
        

        Mockito.when(deviceRepository.findById(Mockito.any())).thenReturn(Optional.of(deviceMock));

        // Llamada al servicio y aserciones
        Device device = deviceService.getDeviceById(1);

        assertNotNull(device);
        assertEquals(1L, device.getId());
        assertEquals("Equipo_01", device.getName());
        assertEquals("usuario1", device.getAssignedUser());
        assertEquals("portátil", device.getType());
        // ... realiza aserciones sobre los demás campos

        // Puedes agregar más pruebas unitarias para otros métodos del servicio
    }
}
