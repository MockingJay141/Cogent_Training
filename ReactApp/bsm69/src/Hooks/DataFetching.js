import { useEffect, useState } from "react";
import axios from 'axios';

function DataFetching() {
    const [post, setPost] = useState({})
    const [id, setId] = useState(2)
    const [idFromButtonClick, setIdFromButtonClick] = useState(2)

    useEffect (() => {
        axios.
        get(`https://jsonplaceholder.typicode.com/posts/${id}`)
        .then(res => {
            console.log(res.data)
            setPost(res.data)
        })
        .catch(err => {
            console.log(err)
        })
    }, [idFromButtonClick]

    ) 

    const handleClick = () => {
        setIdFromButtonClick(id)
    }

    return(
        <div>
            <input type="text" value={id} onChange={e => setId(e.target.value)}/>
            <button type="button" class="btn btn-primary" onClick={handleClick}>Fetch button</button>
            <div>{post.id}</div>
            <div>{post.title}</div>
            <div>{post.body}</div>    
        </div>
    )
}

export default DataFetching