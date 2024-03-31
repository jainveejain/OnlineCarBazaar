import React, { useState } from "react";
import { useNavigate } from 'react-router-dom';

const Register = (props) => {
    const navigate = useNavigate();

    const [firstName, setFirstName] = useState('')
    const [lastName, setLastName] = useState('')
    const [dateOfBirth, setDateOfBirth] = useState('')
    const [phoneNumber,setPhoneNumber] = useState('')
    const [address, setAddress] = useState('')
    const [city,setCity] = useState('')
    const [state,setState] = useState('')
    const [postalCode,setPostalCode] = useState('')
    const [country,setCountry] = useState('')
    const [email, setEmail] = useState('')
    const [password, setPassword] = useState('')
    const [confirmPassword, setConfirmPassword] = useState('')
    
    const [firstNameError, setFirstNameError] = useState('')
    const [lastNameError, setLastNameError] = useState('')
    const [dateOfBirthError, setDateOfBirthError] = useState('')
    const [phoneNumberError,setPhoneNumberError] =useState('')
    const [addressError, setAddressError] = useState('')
    const [cityError,setCityError] = useState('')
    const [stateError,setStateError] = useState('')
    const [postalCodeError,setPostalCodeError] = useState('')
    const [countryError,setCountryError] = useState('')
    const [emailError, setEmailError] = useState('')
    const [passwordError, setPasswordError] = useState('')
    const [confirmPasswordError, setConfirmPasswordError] = useState('')

    const onButtonClick = () => {
        setFirstNameError('')
        setLastNameError('')
        setEmailError('')
        setPasswordError('')
        setConfirmPasswordError('')
        setDateOfBirthError('')
        setAddressError('')

        if ('' === firstName) {
            setFirstNameError('please Enter the valid FirstName')
            return
        }

        if ('' === lastName) {
            setLastNameError('please Enter the valid LastName')
            return
        }
        if ('' === dateOfBirth) {
            setDateOfBirthError('please Enter the valid date of birth')
            return
        }
        if ('' === phoneNumber) {
            setPhoneNumberError('please Enter the valid Phone Number')
            return
        }
        if (phoneNumber.length!==10) {
            setPhoneNumberError('please Enter the valid Phone Number')
            return
        }
        if ('' === address) {
            setAddressError('please Enter the valid Address')
            return
        }
        if ('' === city) {
            setCityError('please Enter the valid City')
            return
        }
        if ('' === state) {
            setStateError('please Enter the valid State')
            return
        }
        if ('' === postalCode) {
            setPostalCodeError('please Enter the valid Postal Code')
            return
        }
        if(postalCode.length!==6){
            setPostalCodeError('please Enter the valid Postal Code')
            return
        }
        if(''=== country){
            setCountryError('please Enter the valid Country')
            return
        }

        if (!/^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/.test(email)) {
            setEmailError('Please enter a valid email')
            return
        }

        if ('' === password) {
            setPasswordError('please Enter the valid password')
            return
        }

        if (password.length < 7) {
            setPasswordError('The password must be 8 characters or longer')
            return
        }

        if (password !== confirmPassword) {
            setConfirmPasswordError('password and confirmpassword should be the same')
            return
        }

        //Now we will send data to backend server
        fetch('http://localhost:8080/user', {
            method: 'post',
            headers: {'Content-Type':'application/json'},
            body: JSON.stringify({
             "firstName": firstName,
             "lastName" : lastName,
             "dob" : dateOfBirth,
             "addressLine" : address,
             "email" : email,
             "password" : password,
             "city" : city,
             "postalCode" : postalCode,
             "state" : state,
             "country" : country,
             "phoneNo" : phoneNumber

            })
    }).then((response)=>{
        console.log("response got from server"+JSON.stringify(response));
        if(response.ok){
            navigate('/login')
        }
    });
    }

    return (
        <div className='mainContainer'>
            <div className='titleContainer'>
                <div><h1>This is Registration page</h1></div>
            </div>
            <br />
            <div className='inputContainer'>

                <label>FirstName : <input
                    value={firstName}
                    onChange={(ev) => { setFirstName(ev.target.value) }}
                    placeholder='Enter the FirstName'
                    className='inputBox'
                />
                </label>
                <label className="errorLabel">{firstNameError}</label>
            </div>
            <br />
            <div className='inputContainer'>
                <label>LastName : <input
                    value={lastName}
                    onChange={(ev) => { setLastName(ev.target.value) }}
                    placeholder='Enter the LastName'
                    className='inputBox'
                />
                </label>
                <label className="errorLabel">{lastNameError}</label>
            </div>
            <br />
            <div className='inputContainer' >
                <label>Date of Birth : <input
                    value={dateOfBirth}
                    type="date"
                    onChange={(ev) => { setDateOfBirth(ev.target.value) }}
                    placeholder='Enter the Date of Birth'
                    className='inputBox'
                />
                </label>
                <label className="errorLabel">{dateOfBirthError}</label>
            </div>
            <br />
            <div className='inputContainer' >
                <label>Phone Number : <input
                    value={phoneNumber}
                    type="number"
                    onChange={(ev) => { setPhoneNumber(ev.target.value) }}
                    placeholder='Enter the Phone Number'
                    className='inputBox'
                />
                </label>
                <label className="errorLabel">{phoneNumberError}</label>
            </div>
            <br/>
            <div className='inputContainer' >
                <label> Address : <input
                    value={address}
                    onChange={(ev) => { setAddress(ev.target.value) }}
                    placeholder='Enter the Address'
                    className='inputBox'
                />
                </label>
                <label className="errorLabel">{addressError}</label>
            </div>
            <br />
            <div className='inputContainer' >
                <label> City : <input
                    value={city}
                    onChange={(ev) => { setCity(ev.target.value) }}
                    placeholder='Enter the City'
                    className='inputBox'
                />
                </label>
                <label className="errorLabel">{cityError}</label>
            </div>
            <br/>
            <div className='inputContainer' >
                <label> State : <input
                    value={state}
                    onChange={(ev) => { setState(ev.target.value) }}
                    placeholder='Enter the State'
                    className='inputBox'
                />
                </label>
                <label className="errorLabel">{stateError}</label>
            </div>
            <br/>
            <div className='inputContainer' >
                <label> PostalCode : <input
                    value={postalCode}
                    type="number"
                    onChange={(ev) => { setPostalCode(ev.target.value) }}
                    placeholder='Enter the postalCode'
                    className='inputBox'
                />
                </label>
                <label className="errorLabel">{postalCodeError}</label>
            </div>
            <br/>
            <div className='inputContainer' >
                <label> Country : <input
                    value={country}
                    onChange={(ev) => { setCountry(ev.target.value) }}
                    placeholder='Enter the country'
                    className='inputBox'
                />
                </label>
                <label className="errorLabel">{countryError}</label>
            </div>
            <br/>
            <div className='inputContainer'>
                <label>Email : <input
                    value={email}
                    onChange={(ev) => { setEmail(ev.target.value) }}
                    placeholder='Enter the email'
                    className='inputBox'
                />
                </label>
                <label className="errorLabel">{emailError}</label>
            </div>
            <br />
            <div className='inputContainer'>
                <label>Password : <input
                    value={password}
                    type="password"
                    onChange={(ev) => { setPassword(ev.target.value) }}
                    placeholder='Enter the password'
                    className='inputBox'
                />
                </label>
                <label className="errorLabel">{passwordError}</label>
            </div>
            <br />
            <div className='inputContainer'>
                <label>ConfirmPassword : <input
                    value={confirmPassword}
                    type="password"
                    onChange={(ev) => { setConfirmPassword(ev.target.value) }}
                    placeholder='Enter the password again'
                    className='inputBox'
                />
                </label>
                <label className="errorLabel">{confirmPasswordError}</label>
            </div>
            <br />
            <div className={'inputContainer'}>
                <input className={'inputButton'} type="button" onClick={onButtonClick} value={'register me'} />
            </div>
        </div>
    )
}

export default Register;