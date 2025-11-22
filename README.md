## 📊 Flujograma del Proceso de Reserva de SmartPark Corregido

**```mermaid**

graph TD
    
    A[INICIO: Conductor busca estacionamiento] --> B(Abrir App SmartPark);

    B --> C{Consultar Base de Datos SmartPark};
    C --> D((Base de Datos / Sensores IoT));
    D --> E{¿Hay espacios libres?};

    E -- NO --> F[Mostrar Alternativas / Notificar];
    %% Vuelve a buscar
    F --> B; 

    E -- SÍ --> G[Mostrar Mapa, Bahías Libres y Tarifa];

    G --> H{¿Reservar Espacio?};
    H -- NO --> I[Navegar directo al estacionamiento];

    H -- SÍ --> J[Bloquear Espacio y Cobrar Tarifa de Reserva];
    J --> I;

    K[Llegada y Ocupación de Bahía (Sensor IoT)] --> L[Sistema inicia contador de pago];
    I --> K;

    L --> M[Salida del Vehículo];
    M --> N[Sensor detecta Salida / Cálculo de Tarifa Final];
    N --> O[App presenta Pago Final];

    O --> P{¿Pago Exitoso?};
    P -- NO --> Q[Notificar Usuario con Cuenta Pendiente];
    P -- SÍ --> R[Liberar Espacio en Tiempo Real (BD)];
    R --> S[FIN];
**```**
