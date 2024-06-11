import { useState } from "react"

function HookCounterThree() {

    const[name, setName] = useState({firstName: '', lastName: ''})
    console.log({name})

    return(
        <form>
            <label>FirstName</label>
            <input type="text" value={name.firstName} onChange={e => setName({...name, firstName: e.target.value})} />

            <label>LastName</label>
            <input type="text" value={name.lastName} onChange={e => setName({...name, lastName: e.target.value})} />

            <h4>Your First Name is : {name.firstName}</h4>
            <h4>Your Last Name is : {name.lastName}</h4>

            <h4>{JSON.stringify(name)}</h4>
        </form>
    )
}

export default HookCounterThree