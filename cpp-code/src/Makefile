CC := g++
SRC_DIR := src
INC_DIR := include
BUILD_DIR := build
SRCEXT := cpp
OBJECTS := $(patsubst $(SRC_DIR)/%,$(BUILD_DIR)/%,$(SOURCES:.$(SRCEXT)=.o))
SOURCES := $(shell find $(SRC_DIR) -type f -name "*.$(SRCEXT)")
LIBNAME := librncpp-example.so

override INC += -I$(INC_DIR)
override CFLAGS += -std=c++11 -O3 -Wall
override LDFLAGS += -std=c++11 -O3 -Wall

LDLIBS :=

$(BUILDDIR)/%.o: $(SRCDIR)/%.$(SRCEXT)
	@mkdir -p $(dir $@)
	@echo " $(CC) $(CFLAGS) $(INC) -c -o $@ $<"; $(CC) $(CFLAGS) $(INC) -c -o $@ $<

all: library

library: $(OBJECTS)
	$(CC) $(LDFLAGS) -shared $(OBJECTS) $(LDPATH) $(LDLIBS) -o $(BUILDDIR)/$(LIBNAME)

clean:
	$(RM) -r $(BUILDDIR) $(TARGET)
