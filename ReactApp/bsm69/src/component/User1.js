import { Component } from "react";


class User1 extends Component {

    componentWillUnmount() {
        console.warn("componentWillUnmount Call")
        alert("User has been deleted");

    }

    render() {
        console.warn("Render call")
        return(
            <div>
                <h3>
                    User Name: Allen
                </h3>

                <h3>
                    User email: allen@gmail.com
                </h3>
            </div>
        )
    }
}

export default User1