import logo from './logo.svg';
import './App.css';
import Hello from './component/Hello';
import Message from './component/Message';
import Greet from './component/Greet';
import Person from './component/Person';
import NameList from './component/NameList';
import Counter from './component/Counter';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        {/* <Message message = "Welcome" />
       <Hello/> */}
       {/* <Greet name = 'Omkar' heroName = "MockingJay">
        <p>This is children props</p>
       </Greet> */}
      {/* <NameList></NameList> */}

      <Counter/>


      </header>
    </div>
  );
}

export default App;
