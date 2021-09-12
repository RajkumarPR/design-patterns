package com.design.patterns.structural.adapter;

interface BrowserDriver {
    void findElement();
    void clickElement();
}

// chrome directly support the BrowserDriver interface
// no adapter required
class ChromeBrowser implements BrowserDriver {

    @Override
    public void findElement() {
        System.out.println("Chrome browser driver's findElement()");
    }

    @Override
    public void clickElement() {
        System.out.println("Chrome browser driver's clickElement()");
    }
}


// Adaptee Internet explore browser, which is a separate class which does not supports
// BrowserDriver interface, so it requires an adapter
class IEBrowser {


    void selectElement() {
        System.out.println("Internet explorer select element");
    }

    void onClickElement() {
        System.out.println("Internet element on click element");
    }

}

public class BrowserAdapter implements BrowserDriver {
    private IEBrowser ieBrowser;

    public BrowserAdapter(IEBrowser ieBrowser) {
        this.ieBrowser = ieBrowser;
    }

    @Override
    public void findElement() {
        this.ieBrowser.selectElement();
    }

    @Override
    public void clickElement() {
        this.ieBrowser.onClickElement();
    }
}