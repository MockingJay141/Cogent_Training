import logo from './logo.svg';
import './App.css';
import Hello from './component/Hello';
import Message from './component/Message';
import Greet from './component/Greet';
import Person from './component/Person';
import NameList from './component/NameList';
import Counter from './component/Counter';
import ParentComponent from './component/ParentComponent';
import LifeCycle1 from './component/LifeCycle1';
import UnMount from './component/UnMount';
import Hero from './component/Hero';
import ErrorBoundary from './component/ErrorBoundary';
import HoverCounter from './component/HoverCounter';
import ClickCounter from './component/ClickCounter';
import HookCounter from './Hooks/HookCounter';
import HookCounterTwo from './Hooks/HookCounterTwo';
import HookCounterThree from './Hooks/HookCounterThree';
import ClassCounterOne from './component/ClassCounterOne';
import DataFetching from './Hooks/DataFetching';
import Navbar from './component/NavBar';
import { Route, Routes } from 'react-router-dom';
import Customer from './APICall/Customer';

function App() {
  return (
    <div className="App">
        {/* <Message message = "Welcome" />
       <Hello/> */}
       {/* <Greet name = 'Omkar' heroName = "MockingJay">
        <p>This is children props</p>
       </Greet> */}
      {/* <NameList></NameList> */}

      {/* <Counter/> */}

      {/* <ParentComponent /> */}

      {/* <LifeCycle1/> */}

      {/* <UnMount /> */}

      {/* <ErrorBoundary>
        <Hero heroName = "Joker"/>
      </ErrorBoundary> */}

      {/* <HoverCounter/>
      <ClickCounter/> */}

      {/* <HookCounter/> */}

      {/* <HookCounterTwo/> */}

      {/* <HookCounterThree/> */}
      
      {/* <ClassCounterOne/> */}

      {/* <DataFetching/> */}

      <Navbar />

        <Routes>
          <Route exact path="/" element={<HookCounter />} />
          <Route exact path="/hcounter" element={<HoverCounter />} />
          <Route exact path="/hcounter2" element={<HookCounterTwo />} />
          <Route exact path="/hcounter3" element={<HookCounterThree />} />
          <Route exact path="/customer" element={<Customer />} />
          <Route exact path="/addCustomer" element={<Customer />} />
          <Route exact path="/register" element={<Hero/>} />
        </Routes>


    </div>
  );
}

export default App;
