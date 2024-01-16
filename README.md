## Parking Lot Management System
The Parking Lot Management System is a Spring Boot application designed to manage vehicles in a parking lot. It provides endpoints to retrieve parking information, park a vehicle, and unpark a vehicle.

### Endpoints

#### Get All Vehicles:

- Endpoint: /parkinglot/parkinginfo
- HTTP Method: GET
- Description: Retrieve information about all vehicles currently parked in the lot.
- Response Format: JSON array of VehicleDTO objects.

#### Park a Vehicle:

- Endpoint: /parkinglot/park
- HTTP Method: POST
- Request Body: VehicleDTO object representing the vehicle to be parked.
```
{
  "id": 1,
  "licensePlate": "ABC123",
  "vehicleType": "Car"
}
```
- Description: Park a vehicle in the parking lot.
- Response Format: String message indicating the result of the operation.

#### Unpark a Vehicle:

- Endpoint: /parkinglot/unpark
- HTTP Method: DELETE
- Request Parameter: id - ID of the vehicle to be unparked.
- Description: Unpark a vehicle from the parking lot.
- Response Format: String message indicating the result of the operation.

## Authors

- [@anupamhaldkar](https://www.github.com/anupamhaldkar)

