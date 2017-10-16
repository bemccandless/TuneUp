import { TuneupClientPage } from './app.po';

describe('tuneup-client App', () => {
  let page: TuneupClientPage;

  beforeEach(() => {
    page = new TuneupClientPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
