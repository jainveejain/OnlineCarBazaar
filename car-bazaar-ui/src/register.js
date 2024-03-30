import React,{useState} from "react";
const Register = (props) => {
    const[firstName, setFirstName] = useState('')
    const[lastName,setLastName] = useState('')
    const[email,setEmail] = useState('')
    const[password,setPassword] = useState('')
    const[Confirmpassword,setConfirmPassword] = useState('')

    const [firstNameError, setFirstNameError] = useState('')
    const [lastNameError, setLastNameError] = useState('')
    const [emailError, setEmailError] = useState('')
    const [passwordError, setPasswordError] = useState('')
    const [confirmPasswordError, setConfirmPasswordError] = useState('')

    const onButtonClick = () =>{
        setFirstNameError('')
        setLastNameError('')
        setEmailError('')
        setPasswordError('')
        setConfirmPasswordError('')
        

        if(''===firstName){
            setFirstNameError('please Enter the valid FirstName')
            return
        }

        if(''===lastName){
            setLastNameError('please Enter the valid LastName')
            return
        }


        if (!/^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/.test(email)) {
            setEmailError('Please enter a valid email')
            return
        }

        if(''===password){
            setPasswordError('please Enter the valid password')
            return
        }

        if (password.length < 7) {
            setPasswordError('The password must be 8 characters or longer')
            return
        }

        if(''===Confirmpassword){
            setConfirmPasswordError('password and confirmpassword should be the same')
            return
        }

        //Now we will send data to backend server
    }

    return (
        <div className='mainContainer'>
            <div className='titleContainer'>
                <div><h1>This is Registration page</h1></div>
            </div>
        <br/>
            <div className='inputContainer'>
                
                <label>FirstName : <input 
                value={firstName}
                onChange={(ev)=>{ setFirstName(ev.target.value)}}
                placeholder = 'Enter the FirstName'
                className='inputBox'
                    />
                </label>
                <label className="errorLabel">{firstNameError}</label>
            </div>
        <br/>
            <div className='inputContainer'>
                <label>LastName : <input
                value= {lastName}
                onChange={(ev)=>{ setLastName(ev.target.value)}}
                placeholder= 'Enter the LastName'
                className= 'inputBox'
                     />  
                </label>  
                <label className="errorLabel">{lastNameError}</label> 
            </div>   
        <br/>
            <div className='inputContainer'>
                <label>Email : <input
                value={email}
                onChange={(ev)=>{ setEmail(ev.target.value)}}
                placeholder='Enter the email'
                className='inputBox'
                />
                </label>
                <label className="errorLabel">{emailError}</label>
            </div> 
        <br/>
            <div className='inputContainer'>
               <label>Password : <input
               value={password}
               onChange={(ev)=>{ setPassword(ev.target.value)}}
               placeholder='Enter the password'
               className='inputBox'
                />
               </label> 
               <label className="errorLabel">{passwordError}</label>
            </div>  
        <br/>
            <div className='inputContainer'>
            <label>ConfirmPassword : <input
               value={Confirmpassword}
               onChange={(ev)=>{ setConfirmPassword(ev.target.value)}}
               placeholder='Enter the password again'
               className='inputBox'
                />
               </label> 
               <label className="errorLabel">{confirmPasswordError}</label>
            </div>  
        <br/>
            <div className={'inputContainer'}>
                <input className={'inputButton'} type="button" onClick={onButtonClick} value={'register me'} />
            </div>
        </div>
    )
}

export default Register;