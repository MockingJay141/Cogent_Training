import { Component } from "react";
import ApiService from "../Service/ApiService";
import { Link } from "react-router-dom";



class Customer extends Component{
    constructor(props){
        super(props)
        this.state = {
            users: [],
        }
    }

    componentDidMount() {
        this.loadEmployeeList();
    }

    loadEmployeeList() {
        ApiService.fetchUsers().then((response) => {
            this.setState({users: response.data})   
        })
    }


    render() {
        return(
            <div>
                <h2 className="text-center">User Details</h2>
                <Link class="nav-link" to="/adduser">Add User</Link>

                <table className="table table-striped">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>MobileNo.</th>
                            <th>Email</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.customers.map(
                                customer =>
                                    <tr key = {customer.id}>
                                        <td>{customer.id}</td>
                                        <td>{customer.name}</td>
                                        <td>{customer.username}</td>
                                        <td>{customer.email}</td>
                                        <td>
                                            <button className="btn btn-success">Delete</button>
                                            <button className="btn btn-success">Update</button>
                                        </td>
                                    </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>
        )
    }
}

export default Customer