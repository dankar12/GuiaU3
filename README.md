## 📊 Flujograma del Proceso de Reserva de SmartPark

```mermaid
graph TD
    %% Símbolos: A[Óvalo/Inicio], D{Rombo/Decisión}, C[Rectángulo/Proceso], B((Cilindro/BD))

    A[INICIO: Conductor busca estacionamiento] --> B(Abrir App SmartPark);

    %% Proceso de Búsqueda y Consulta
    B --> C{Consultar Base de Datos SmartPark};
    C --> D((Base de Datos / Sensores IoT));
    D --> E{¿Hay espacios libres?};

    %% Decisión de Disponibilidad
    E -- NO --> F[Mostrar Alternativas / Notificar];
    F --> B; %% Vuelve a buscar

    E -- SÍ --> G[Mostrar Mapa, Bahías Libres y Tarifa];

    %% Decisión de Reserva
    G --> H{¿Reservar Espacio?};
    H -- NO --> I[Navegar directo al estacionamiento];

    H -- SÍ --> J[Bloquear Espacio y Cobrar Tarifa de Reserva];
    J --> I;

    %% Proceso de Ocupación
    I --> K[Llegada y Ocupación de Bahía (Sensor IoT)];
    K --> L[Sistema inicia contador de pago];

    %% Proceso de Salida y Pago
    L --> M[Salida del Vehículo];
    M --> N[Sensor detecta Salida / Cálculo de Tarifa Final];
    N --> O[App presenta Pago Final];

    %% Decisión de Pago
    O --> P{¿Pago Exitoso?};
    P -- NO --> Q[Notificar Usuario con Cuenta Pendiente];
    P -- SÍ --> R[Liberar Espacio en Tiempo Real (BD)];
    R --> S[FIN];
