import React, {Component, component} from 'react';
import { render } from 'react-dom';

class Message extends Component {

    constructor(props){
        super(props)
        this.state = {
            message: props.message
        }
    }

    changeMessage() {
        this.setState({
            message: "Thank you"
        })
    }
    
    render() {
        return(
            <div>
                <h1>{this.state.message}</h1>
                <button onClick={() => this.changeMessage()}>Subscribe</button>
            </div>
        );
    }
}



export default Message

