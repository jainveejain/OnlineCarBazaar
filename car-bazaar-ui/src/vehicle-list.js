import React, { useState, useEffect } from 'react';
import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';

function VehicleList() {
  const [cars, setCars] = useState([]);

  useEffect(() => {
    // Fetch data from backend API when component mounts
    fetchData();
  }, []);

  const fetchData = async () => {
    try {
      const response = await fetch('http://localhost:8080/vehicle');
      const data = await response.json();
      setCars(data); // Assuming the API response is an array of car objects
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  };

  return (
    <div className="car-list" style={{width : "100vw"}}>
      <div className="card-container">
        {cars.map((car) => (
           <Card style={{ width: '18rem' }}>
           <Card.Img variant="top" src="holder.js/100px180" />
           <Card.Body>
             <Card.Title>{car.model}</Card.Title>
             <Card.Text>
              {car.type}
             </Card.Text>
             <Button variant="primary"> {car.varient.exShowroom_price} Buy Now</Button>
           </Card.Body>
         </Card>
        ))}
      </div>
    </div>
  );
}

export default VehicleList;
