import React from "react";
import moment from "moment";
import ReactDOM from "react-dom";
import { Layout, Menu, Breadcrumb, Icon } from 'antd';
import { DatePicker } from 'antd';
import "./index.css";
import App from "./App";
import Side2 from "./Side2";
import LeftSider from "./LeftSider";
import MyMenu from "./MyMenu";
import registerServiceWorker from "./registerServiceWorker";

const { Header, Content, Footer, Sider } = Layout;
const { RangePicker, MonthPicker } = DatePicker;

class Home extends React.Component {
  render() {
    return (
      <div>
        {/*<App />*/}
        {/*<MyMenu />*/}
        {/*<Side2 />*/}
        <LeftSider />
        <Footer style={{ textAlign: 'center' }}>
          Ant Design ©2016 Created by Ant UED
        </Footer>
        <RangePicker
          defaultValue={[moment('2018-06-06 13:20:14'), moment('2018-06-26 13:20:14')]}
          format="YYYY-MM-DD HH:mm"
          renderExtraFooter={() => 'extra footer'}
          showTime />
      </div>
    );
  }
}
ReactDOM.render(<Home />, document.getElementById('solar-main'));
registerServiceWorker();
