import React, { useEffect } from 'react'
import { useNavigate } from 'react-router-dom'
import VehicleList from './vehicle-list'
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';

const Home = (props) => {
  const { loggedIn, email } = props
  const navigate = useNavigate();

  const onButtonClick = () => {
    if (loggedIn) {
      localStorage.removeItem('user')
      props.setLoggedIn(false)
    } else {
      navigate('/login')
    }
  }

  return (
    <div className="mainContainer">
        <Navbar expand="lg" className="bg-body-tertiary">
      <Container style={{ width: "100vw" }}>
        <Navbar.Brand href="#home">Car Bazaar</Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto">
            <Nav.Link href="#home">Home</Nav.Link>
            <Nav.Link href="#link" onClick={onButtonClick}>{loggedIn ? 'Log out' : 'Log in'}</Nav.Link>
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
      <div className={'titleContainer'}>
        <div>Welcome to Car Bazaar!</div>
      </div>
      <div> "Rev up your search for the perfect ride at Car Bazaar: Where Every Mile Leads to Your Dream Drive!" </div>
      <div className={'buttonContainer'}>
        {loggedIn ? 
        
        <VehicleList />
        
        : <div />}
      </div>
    </div>
  )
}

export default Home